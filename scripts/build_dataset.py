"""Build native binaries and assembly/bytecode outputs for the datasets.

All compiler intermediates are written to temporary directories. Only the
requested final artifacts are retained under datasets/<language>/{bin,asm}.
"""

from __future__ import annotations

import argparse
import json
import re
import shutil
import subprocess
import sys
import tempfile
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
DATASETS = ROOT / "datasets"


class MissingSourceError(Exception):
    """Raised when a required source directory is missing."""


class BuildError(Exception):
    """Raised when a compiler command fails or an expected artifact is absent."""


LANGUAGES = {
    "c": {"ext": "c", "bin_ext": "", "asm_ext": ".s", "kind": "c"},
    "cpp": {"ext": "cpp", "bin_ext": "", "asm_ext": ".s", "kind": "cpp"},
    "clojure": {"ext": "clj", "bin_ext": ".jar", "asm_ext": "", "kind": "jvm_clojure"},
    "cs": {"ext": "cs", "bin_ext": ".dll", "asm_ext": ".il", "kind": "dotnet"},
    "d": {"ext": "d", "bin_ext": "", "asm_ext": ".s", "kind": "d"},
    "go": {"ext": "go", "bin_ext": "", "asm_ext": ".s", "kind": "go"},
    "haskell": {"ext": "hs", "bin_ext": "", "asm_ext": ".s", "kind": "haskell"},
    "java": {
        "ext": "java",
        "bin_ext": ".jar",
        "asm_ext": "",
        "kind": "jvm_java",
    },
    "kotlin": {
        "ext": "kt",
        "bin_ext": ".jar",
        "asm_ext": "",
        "kind": "jvm_kotlin",
    },
    "nim": {"ext": "nim", "bin_ext": "", "asm_ext": ".s", "kind": "nim"},
    "mcs": {"ext": "cs", "bin_ext": ".exe", "asm_ext": ".il", "kind": "mcs"},
    "objc": {"ext": "m", "bin_ext": "", "asm_ext": ".s", "kind": "objc"},
    "rust": {"ext": "rs", "bin_ext": "", "asm_ext": ".s", "kind": "rust"},
    "scala": {
        "ext": "scala",
        "bin_ext": ".jar",
        "asm_ext": "",
        "kind": "jvm_scala",
    },
    "swift": {"ext": "swift", "bin_ext": "", "asm_ext": ".s", "kind": "swift"},
    "v": {"ext": "v", "bin_ext": "", "asm_ext": ".s", "kind": "v"},
}

SCRIPTS = {
    "Tier1": [
        "HelloWorld",
        "Number",
        "Variables",
        "Function",
        "Addition",
        "Subtraction",
        "Multiplication",
        "Division",
        "Modulus",
        "Power",
    ],
    "Tier2": [],
    "Tier3": [],
    "Tier4": [],
    "Tier5": [],
}

OPTIMIZATION_LEVELS = {
    "c": ("O0", "O1", "O2", "O3"),
    "cpp": ("O0", "O1", "O2", "O3"),
    "cs": ("O0", "O2"),  # .NET Optimize: false / true
    "d": ("O0", "O1", "O2", "O3"),
    "go": ("O0", "O2"),  # Go supports disabling optimizations or defaults
    "haskell": ("O0", "O1", "O2"),
    "mcs": ("O0", "O2"),  # Mono mcs -optimize- / -optimize+
    "kotlin": ("O0", "O2"),  # Kotlin -Xno-optimize / default backend optimization
    "nim": ("O0", "O2"),  # Nim --opt:none / --opt:speed
    "objc": ("O0", "O1", "O2", "O3"),
    "rust": ("O0", "O1", "O2", "O3"),
    "swift": ("O0", "O2"),  # Swift -Onone / -O
    "v": ("O0", "O2"),  # V development / -prod modes
}


def run_command(
    command: list[str],
    *,
    cwd: Path | None = None,
    verbose: bool = False,
    combine_output: bool = False,
) -> subprocess.CompletedProcess[str]:
    """Run a compiler without a shell and always expose diagnostics on failure."""

    display = " ".join(str(part) for part in command)
    try:
        if combine_output:
            result = subprocess.run(
                [str(part) for part in command],
                cwd=cwd or ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                check=False,
            )
        else:
            result = subprocess.run(
                [str(part) for part in command],
                cwd=cwd or ROOT,
                text=True,
                capture_output=True,
                check=False,
            )
    except FileNotFoundError as exc:
        raise BuildError(
            f"Command not found: {command[0]} (while running: {display})"
        ) from exc

    if verbose or result.returncode != 0:
        if result.stdout:
            print(result.stdout, end="" if result.stdout.endswith("\n") else "\n")
        if result.stderr:
            print(
                result.stderr,
                end="" if result.stderr.endswith("\n") else "\n",
                file=sys.stderr,
            )

    if result.returncode != 0:
        if result.returncode < 0:
            reason = f"terminated by signal {-result.returncode}"
        else:
            reason = f"exit status {result.returncode}"
        details = "\n".join(
            part for part in (result.stdout, result.stderr) if part
        ).strip()
        raise BuildError(
            f"{display}\nCompiler {reason}." + (f"\n{details}" if details else "")
        )

    return result


def write_text(path: Path, content: str) -> None:
    """
    Write text to a path

    :param path: THe path to write to
    :type path: Path
    :param content: THe content of the file
    :type content: str
    """

    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")


def clean_root_artifacts() -> None:
    """Remove known leftovers made by javac/scalac commands"""

    patterns = ("*.class", "*.tasty", "*.hi", "*.dyn_hi", "*.o", "*.dyn_o")
    removed = 0
    for pattern in patterns:
        for path in ROOT.glob(pattern):
            if path.is_file():
                path.unlink()
                removed += 1

    meta_inf = ROOT / "META-INF"
    if meta_inf.is_dir():
        shutil.rmtree(meta_inf)
        removed += 1

    if removed:
        print(f"Removed {removed} stale compiler artifact(s) from the project root.")


def clean_ghc_intermediates(source: Path) -> None:
    """Remove GHC intermediates left beside a source file by earlier runs."""
    for suffix in (".hi", ".o", ".dyn_hi", ".dyn_o"):
        stale = source.with_suffix(suffix)
        if stale.is_file():
            stale.unlink()


def make_jar(classes_dir: Path, jar_path: Path) -> None:
    """Package class files and language metadata into a standards-compliant JAR."""
    jar_path.parent.mkdir(parents=True, exist_ok=True)
    manifest = "Manifest-Version: 1.0\r\n\r\n"
    with zipfile.ZipFile(jar_path, "w", compression=zipfile.ZIP_DEFLATED) as jar:
        jar.writestr("META-INF/MANIFEST.MF", manifest)
        for file_path in sorted(p for p in classes_dir.rglob("*") if p.is_file()):
            relative = file_path.relative_to(classes_dir).as_posix()
            if relative.upper() == "META-INF/MANIFEST.MF":
                continue
            jar.write(file_path, relative)


def build_jvm(
    language: str,
    source: Path,
    output_bin: Path,
    output_asm: Path,
    stage: Path,
    verbose: bool,
    optimization: str | None = None,
) -> None:
    """
    Build Java JVM-based languages
    """
    classes_dir = stage / "classes"
    classes_dir.mkdir(parents=True, exist_ok=True)

    if language == "clojure":
        source_text = source.read_text(encoding="utf-8")
        namespace_match = re.search(r"\(\s*ns\s+([^\s()\[\]{}]+)", source_text)

        if not namespace_match:
            raise BuildError(
                f"{source.name} has no top-level (ns ...) declaration; "
                "Clojure AOT output requires a namespace."
            )
        namespace = namespace_match.group(1)
        resource_path = Path(
            *[part.replace("-", "_") for part in namespace.split(".")]
        ).with_suffix(".clj")
        source_root = stage / "clojure-src"
        staged_source = source_root / resource_path
        staged_source.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(source, staged_source)

        classpath_paths = [source_root, classes_dir, source.parent]
        relative_paths = [
            path.resolve().relative_to(ROOT.resolve()).as_posix()
            for path in classpath_paths
        ]
        extra_paths_edn = " ".join(json.dumps(path) for path in relative_paths)
        extra_deps = (
            "{:aliases {:dataset-build {:extra-paths [" + extra_paths_edn + "]}}}"
        )
        compile_path = str(classes_dir).replace("\\", "\\\\").replace('"', '\\"')
        expression = (
            f'(binding [*compile-path* "{compile_path}"] (compile \'{namespace}))'
        )
        run_command(
            ["clojure", "-Sdeps", extra_deps, "-M:dataset-build", "-e", expression],
            verbose=verbose,
        )
    else:
        compiler = {
            "java": ["javac", "-d", str(classes_dir), str(source)],
            "kotlin": [
                "kotlinc",
                *(["-Xno-optimize"] if optimization == "O0" else []),
                str(source),
                "-d",
                str(classes_dir),
            ],
            "scala": ["scalac", "-d", str(classes_dir), str(source)],
        }[language]
        run_command(compiler, verbose=verbose)

    class_files = sorted(classes_dir.rglob("*.class"))
    if not class_files:
        raise BuildError(f"{language} compiler succeeded but produced no .class files.")

    if language == "clojure":
        source_text = source.read_text(encoding="utf-8")
        namespace_match = re.search(r"\(\s*ns\s+([^\s()\[\]{}]+)", source_text)

        if namespace_match:
            namespace = namespace_match.group(1)
            resource_path = Path(
                *[part.replace("-", "_") for part in namespace.split(".")]
            ).with_suffix(".clj")
            resource_file = classes_dir / resource_path
            resource_file.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(source, resource_file)

    make_jar(classes_dir, output_bin)

    # output_asm.mkdir(parents=True, exist_ok=True)

    # copied_classes = 0
    # for class_file in class_files:
    #     destination = output_asm / class_file.name

    #     shutil.copy2(class_file, destination)
    #     copied_classes += 1

    # if copied_classes == 0:
    #     raise BuildError("No JVM .class files were available to copy.")

    output_asm.mkdir(parents=True, exist_ok=True)
    asm_file = output_asm / f"{output_bin.stem}.javap"

    class_names = [
        c.relative_to(classes_dir).with_suffix("").as_posix().replace("/", ".")
        for c in class_files
    ]

    result = subprocess.run(
        ["javap", "-c", "-p", "-cp", str(classes_dir), *class_names],
        check=False,
        capture_output=True,
        text=True,
        encoding="utf-8",
    )

    if result.returncode != 0:
        raise BuildError(f"javap failed for {source.name}: {result.stderr}")

    asm_file.write_text(result.stdout, encoding="utf-8")


def get_dotnet_target_framework(verbose: bool) -> str:
    """
    Gets the Dotnet framework
    """
    result = run_command(["dotnet", "--list-sdks"], verbose=verbose)
    versions = re.findall(r"^\s*(\d+)\.(\d+)\.\d+", result.stdout or "", re.MULTILINE)
    if not versions:
        raise BuildError(
            "dotnet is installed, but `dotnet --list-sdks` found no installed SDK."
        )
    major, minor = max((int(a), int(b)) for a, b in versions)
    return f"net{major}.{minor}"


def write_il_dump(assembly: Path, output_asm: Path, verbose: bool) -> None:
    """
    Write IL for C# Languages
    """
    monodis = shutil.which("monodis")
    ildasm = shutil.which("ildasm")
    if monodis:
        result = run_command([monodis, str(assembly)], verbose=verbose)
    elif ildasm:
        result = run_command([ildasm, "/text", str(assembly)], verbose=verbose)
    else:
        raise BuildError(
            "The binary was built, but no IL disassembler is installed. "
            "Install Mono's `monodis` or Microsoft's `ildasm` to create the .il file."
        )
    write_text(output_asm, result.stdout or "")


def build_dotnet(
    source: Path,
    script: str,
    output_bin: Path,
    output_asm: Path,
    stage: Path,
    verbose: bool,
    optimization: str,
) -> None:
    """
    Build .NET C# scripts
    """
    project_dir = stage / "project"
    output_dir = stage / "output"
    project_dir.mkdir(parents=True, exist_ok=True)
    output_dir.mkdir(parents=True, exist_ok=True)

    target_framework = get_dotnet_target_framework(verbose)
    copied_source = project_dir / f"{script}.cs"
    shutil.copy2(source, copied_source)
    project_file = project_dir / f"{script}.csproj"
    optimize = "false" if optimization == "O0" else "true"
    project_file.write_text(
        '<Project Sdk="Microsoft.NET.Sdk">\n'
        "  <PropertyGroup>\n"
        f"    <TargetFramework>{target_framework}</TargetFramework>\n"
        "    <OutputType>Exe</OutputType>\n"
        "    <EnableDefaultCompileItems>false</EnableDefaultCompileItems>\n"
        "    <ImplicitUsings>enable</ImplicitUsings>\n"
        "    <Nullable>disable</Nullable>\n"
        f"    <Optimize>{optimize}</Optimize>\n"
        "    <Optimize>true</Optimize>\n"
        "    <DebugType>none</DebugType>\n"
        "  </PropertyGroup>\n"
        "  <ItemGroup>\n"
        f'    <Compile Include="{script}.cs" />\n'
        "  </ItemGroup>\n"
        "</Project>\n",
        encoding="utf-8",
    )

    run_command(
        [
            "dotnet",
            "build",
            str(project_file),
            "--configuration",
            "Release",
            "--output",
            str(output_dir),
            "--nologo",
            "--verbosity",
            "minimal",
        ],
        cwd=project_dir,
        verbose=verbose,
    )
    built_dll = output_dir / f"{script}.dll"
    if not built_dll.is_file():
        raise BuildError(f"dotnet build completed but did not create {built_dll.name}.")

    output_bin.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(built_dll, output_bin)
    write_il_dump(output_bin, output_asm, verbose)


def build_mcs(
    source: Path,
    script: str,
    output_bin: Path,
    output_asm: Path,
    stage: Path,
    verbose: bool,
    optimization: str,
) -> None:
    """
    Build Mono C# scripts
    """
    staged_exe = stage / f"{script}.exe"
    optimize_flag = "-optimize-" if optimization == "O0" else "-optimize+"
    run_command(
        ["mcs", optimize_flag, str(source), f"-out:{staged_exe}"],
        cwd=stage,
        verbose=verbose,
    )
    if not staged_exe.is_file():
        raise BuildError("mcs completed but did not create the expected .exe file.")
    output_bin.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(staged_exe, output_bin)
    write_il_dump(output_bin, output_asm, verbose)


def build_binary(
    language: str,
    source: Path,
    output_bin: Path,
    stage: Path,
    verbose: bool,
    optimization: str,
) -> None:
    """
    Build other binaries
    """
    kind = LANGUAGES[language]["kind"]
    output_bin.parent.mkdir(parents=True, exist_ok=True)
    level = int(optimization[1:])

    if kind == "c":
        command = ["clang", f"-O{level}", str(source), "-o", str(output_bin)]
    elif kind == "cpp":
        command = ["clang++", f"-O{level}", str(source), "-o", str(output_bin)]
    elif kind == "d":
        command = ["ldc2", f"-O{level}", str(source), f"-of={output_bin}"]
    elif kind == "go":
        command = ["go", "build"]
        gcflags = "-N -l" if optimization == "O0" else None
        if gcflags:
            command.append(f"-gcflags=all={gcflags}")
        command.extend(["-o", str(output_bin), str(source)])
    elif kind == "haskell":
        intermediates = stage / "ghc-bin"
        intermediates.mkdir(parents=True, exist_ok=True)
        command = [
            "ghc",
            f"-{optimization}",
            "-fforce-recomp",
            f"-outputdir={intermediates}",
            str(source),
            "-o",
            str(output_bin),
        ]
    elif kind == "nim":
        cache = stage / "nim-bin-cache"
        opt_flag = "--opt:none" if optimization == "O0" else "--opt:speed"
        command = [
            "nim",
            "c",
            opt_flag,
            "--forceBuild:on",
            f"--nimcache:{cache}",
            f"--out:{output_bin}",
            str(source),
        ]
    elif kind == "objc":
        command = [
            "clang",
            f"-O{level}",
            str(source),
            "-framework",
            "Foundation",
            "-o",
            str(output_bin),
        ]
    elif kind == "rust":
        command = [
            "rustc",
            "-C",
            f"opt-level={level}",
            str(source),
            "-o",
            str(output_bin),
        ]
    elif kind == "swift":
        opt_flag = "-Onone" if optimization == "O0" else "-O"
        command = ["swiftc", opt_flag, str(source), "-o", str(output_bin)]
    elif kind == "v":
        command = ["v"]
        if optimization == "O2":
            command.append("-prod")
        command.extend(["-o", str(output_bin), str(source)])
    else:
        raise BuildError(f"No native binary handler exists for {language}.")

    run_command(command, cwd=stage, verbose=verbose)
    if not output_bin.is_file():
        raise BuildError(
            f"Compiler returned success but did not create {output_bin.name}."
        )


def build_assembly(
    language: str,
    source: Path,
    output_asm: Path,
    stage: Path,
    verbose: bool,
    optimization: str,
) -> None:
    """
    Build ASM for other scripts
    """
    kind = LANGUAGES[language]["kind"]
    output_asm.parent.mkdir(parents=True, exist_ok=True)
    level = int(optimization[1:])

    if kind == "c":
        command = ["clang", f"-O{level}", "-S", str(source), "-o", str(output_asm)]
        run_command(command, cwd=stage, verbose=verbose)
    elif kind == "cpp":
        command = ["clang++", f"-O{level}", "-S", str(source), "-o", str(output_asm)]
        run_command(command, cwd=stage, verbose=verbose)
    elif kind == "d":
        run_command(
            ["ldc2", f"-O{level}", "-output-s", str(source), f"-of={output_asm}"],
            cwd=stage,
            verbose=verbose,
        )
    elif kind == "go":
        temp_binary = stage / "go-asm-probe"
        command = ["go", "build"]
        gcflags = "-N -l -S" if optimization == "O0" else "-S"
        command.extend([f"-gcflags=all={gcflags}", "-o", str(temp_binary), str(source)])
        result = run_command(
            command,
            cwd=stage,
            verbose=verbose,
            combine_output=True,
        )
        write_text(output_asm, result.stdout or "")
    elif kind == "haskell":
        intermediates = stage / "ghc-asm"
        intermediates.mkdir(parents=True, exist_ok=True)
        run_command(
            [
                "ghc",
                f"-{optimization}",
                "-fforce-recomp",
                "-S",
                f"-outputdir={intermediates}",
                str(source),
                "-o",
                str(output_asm),
            ],
            cwd=stage,
            verbose=verbose,
        )
    elif kind == "objc":
        run_command(
            ["clang", f"-O{level}", "-S", str(source), "-o", str(output_asm)],
            cwd=stage,
            verbose=verbose,
        )
    elif kind == "rust":
        run_command(
            [
                "rustc",
                "--emit=asm",
                "-C",
                f"opt-level={level}",
                str(source),
                "-o",
                str(output_asm),
            ],
            cwd=stage,
            verbose=verbose,
        )
    elif kind == "swift":
        opt_flag = "-Onone" if optimization == "O0" else "-O"
        run_command(
            ["swiftc", opt_flag, "-emit-assembly", str(source), "-o", str(output_asm)],
            cwd=stage,
            verbose=verbose,
        )
    elif kind == "nim":
        cache = stage / "nim-asm-cache"
        cache.mkdir(parents=True, exist_ok=True)
        opt_flag = "--opt:none" if optimization == "O0" else "--opt:speed"
        run_command(
            [
                "nim",
                "c",
                opt_flag,
                "--forceBuild:on",
                f"--nimcache:{cache}",
                "--noLinking:on",
                "--passC:-S",
                str(source),
            ],
            cwd=stage,
            verbose=verbose,
        )
        generated = sorted(p for p in cache.rglob("*.o") if p.is_file())
        pieces = []
        for path in generated:
            try:
                assembly_text = path.read_text(encoding="utf-8")
            except (UnicodeDecodeError, OSError):
                continue
            if "\x00" in assembly_text or not any(
                marker in assembly_text
                for marker in (".section", ".text", ".globl", "_main:")
            ):
                continue
            pieces.append(assembly_text)
        if not pieces:
            raise BuildError(
                "Nim compiled without linking, but no textual assembly was found "
                f"in {cache}. Check whether Nim is using a Clang/GCC C backend."
            )
        write_text(output_asm, "\n".join(pieces))
    elif kind == "v":
        generated_c = stage / f"{source.stem}.generated.c"
        v_command = ["v"]
        if optimization == "O2":
            v_command.append("-prod")
        run_command(
            [*v_command, "-o", str(generated_c), str(source)],
            cwd=stage,
            verbose=verbose,
        )

        flags_command = ["v"]
        if optimization == "O2":
            flags_command.append("-prod")
        flags_command.extend(
            [
                "-dump-c-flags",
                "-",
                "-o",
                str(stage / "v-flags-probe"),
                str(source),
            ]
        )


def compile_scripts(verbose: bool, active_languages) -> None:
    """Compile all scripts"""
    clean_root_artifacts()

    if isinstance(active_languages, dict):
        target_languages = active_languages.items()
    else:
        allowed = (
            set(active_languages)
            if not isinstance(active_languages, str)
            else {active_languages}
        )
        target_languages = {k: v for k, v in LANGUAGES.items() if k in allowed}.items()

    for language, config in target_languages:
        for tier, scripts in SCRIPTS.items():
            for script in scripts:
                if language == "go":
                    source = (
                        DATASETS
                        / language
                        / "source"
                        / tier
                        / script
                        / f"{script}.{config['ext']}"
                    )
                else:
                    source = (
                        DATASETS
                        / language
                        / "source"
                        / tier
                        / f"{script}.{config['ext']}"
                    )

                if not source.is_file():
                    print(f"Skipping missing source file: {source.relative_to(ROOT)}")
                    continue

                bin_dir = DATASETS / language / "bin" / tier
                asm_dir = DATASETS / language / "asm" / tier
                kind = config["kind"]

                levels: tuple[str | None, ...]
                if language == "kotlin":
                    levels = OPTIMIZATION_LEVELS[language]
                elif kind.startswith("jvm_"):
                    levels = (None,)
                else:
                    levels = OPTIMIZATION_LEVELS[language]

                for stale in bin_dir.glob(f"{script}_O*"):
                    if stale.is_file():
                        stale.unlink()
                old_bin = bin_dir / f"{script}{config['bin_ext']}"
                if old_bin.is_file():
                    old_bin.unlink()
                if kind.startswith("jvm_"):
                    stale_asm = asm_dir.glob(f"{script}*.javap")
                else:
                    stale_asm = asm_dir.glob(f"{script}_O*{config['asm_ext']}")
                for stale in stale_asm:
                    if stale.is_file():
                        stale.unlink()
                old_asm = asm_dir / f"{script}{config['asm_ext']}"
                if old_asm.is_file():
                    old_asm.unlink()

                print(f"Building {language}/{tier}/{script}")

                for optimization in levels:
                    suffix = f"_{optimization}" if optimization else ""
                    output_bin = bin_dir / f"{script}{suffix}{config['bin_ext']}"
                    output_asm = asm_dir / f"{script}{suffix}{config['asm_ext']}"
                    if kind.startswith("jvm_"):
                        output_asm = asm_dir

                    with tempfile.TemporaryDirectory(
                        prefix=f".build_{language}_{script}_{optimization or 'default'}_",
                        dir=ROOT,
                    ) as temp_name:
                        stage = Path(temp_name)
                        binary_ok = False
                        assembly_ok = False

                        try:
                            if kind.startswith("jvm_"):
                                build_jvm(
                                    language,
                                    source,
                                    output_bin,
                                    output_asm,
                                    stage,
                                    verbose,
                                    optimization,
                                )
                                binary_ok = assembly_ok = True
                            elif kind == "dotnet":
                                assert optimization is not None, (
                                    "A .NET build must have an optimization level."
                                )

                                build_dotnet(
                                    source, script, output_bin, output_asm,
                                    stage, verbose, optimization,
                                )
                                binary_ok = True
                                assembly_ok = output_asm.is_file()
                            elif kind == "mcs":
                                assert optimization is not None, (
                                    "A Mono C# build must have an optimization level."
                                )
                                build_mcs(
                                    source, script, output_bin, output_asm,
                                    stage, verbose, optimization,
                                )
                                binary_ok = True
                                assembly_ok = output_asm.is_file()
                            else:
                                assert optimization is not None, (
                                    "A native build must have an optimization level."
                                )
                                build_binary(
                                    language, source, output_bin, stage,
                                    verbose, optimization,
                                )
                                binary_ok = True
                                print(f"binary built: {output_bin.relative_to(ROOT)}")
                        except BuildError as exc:
                            binary_ok = output_bin.is_file()
                            assembly_ok = (
                                output_asm.is_file()
                                if not kind.startswith("jvm_")
                                else any(asm_dir.glob(f"{output_bin.stem}.javap"))
                            )
                            print(
                                f"Build failed for {language}/{script}/"
                                f"{optimization or 'default'}:\n{exc}"
                            )

                        if not kind.startswith("jvm_") and kind not in {
                            "dotnet",
                            "mcs",
                        }:
                            assert optimization is not None, (
                                "Assembly generation must have an optimization level."
                            )

                            try:
                                build_assembly(
                                    language,
                                    source,
                                    output_asm,
                                    stage,
                                    verbose,
                                    optimization,
                                )
                                assembly_ok = True
                                print(f"  assembly: {output_asm.relative_to(ROOT)}")
                            except BuildError as exc:
                                print(
                                    f"  assembly failed for {language}/{script}/"
                                    f"{optimization}:\n{exc}"
                                )

                        if binary_ok and assembly_ok:
                            print(
                                f"  Finished {optimization or 'default'}: binary and "
                                "assembly/bytecode created."
                            )
                        elif binary_ok:
                            print(
                                f"  Finished {optimization or 'default'}: binary created; "
                                "assembly/bytecode missing."
                            )
                        elif assembly_ok:
                            print(
                                f"  Finished {optimization or 'default'}: assembly/bytecode "
                                "created; binary missing."
                            )
                        else:
                            print(
                                f"  Failed {optimization or 'default'}: no final artifacts created."
                            )

                if language == "haskell":
                    clean_ghc_intermediates(source)


def clean_files():
    """
    Clean all files
    """

    print("\n===== Cleaning Files =====\n")

    for language in LANGUAGES:
        print(f"\n=== Cleaning files in {language} ===\n")
        bin_path = Path(DATASETS / language / "bin")
        asm_path = Path(DATASETS / language / "asm")

        for item in bin_path.rglob("*"):
            if item.is_file():
                print(f"Deleting file {item.name}")
                item.unlink()

        for item in asm_path.rglob("*"):
            if item.is_file():
                print(f"Deleting file {item.name}")
                item.unlink()


def check_paths() -> None:
    """
    Check if paths are right
    """
    for language in LANGUAGES:
        source_root = DATASETS / language / "source"

        if not source_root.is_dir():
            raise MissingSourceError(f"Missing source code directory: {source_root}")

        for tier in SCRIPTS:
            tier_source = source_root / tier

            if not tier_source.is_dir():
                raise MissingSourceError(
                    f"Missing {tier} source directory: {tier_source}"
                )

            (DATASETS / language / "asm" / tier).mkdir(parents=True, exist_ok=True)
            (DATASETS / language / "bin" / tier).mkdir(parents=True, exist_ok=True)


def main() -> int:
    """
    Main function
    """
    parser = argparse.ArgumentParser(
        prog="Build Dataset",
        description="Builds binary and assembly/bytecode dataset artifacts.",
        epilog="Run BEFORE training the AI!",
    )
    parser.add_argument(
        "-v",
        "--verbose",
        action="store_true",
        help="Show extra build info",
    )
    parser.add_argument(
        "--clean",
        choices=["all", "files", "skip"],
        default="all",
        help="Clean files: 'all' (clean, continue), 'files' (clean, stop), 'skip' (continue)",
    )
    parser.add_argument(
        "--languages",
        nargs="+",
        choices=LANGUAGES.keys(),
        default=LANGUAGES.keys(),
        help="Pick language(s) to compile scripts for",
    )
    args = parser.parse_args()

    try:
        check_paths()

        if args.clean == "files":
            clean_files()
        elif args.clean == "all":
            clean_files()
            compile_scripts(args.verbose, args.languages)
        else:
            compile_scripts(args.verbose, args.languages)

    except MissingSourceError as e:
        print(str(e))
        return 1

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
