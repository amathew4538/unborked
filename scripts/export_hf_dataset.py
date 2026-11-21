"""Export built dataset artifacts as Hugging Face-compatible Parquet shards."""

from __future__ import annotations

import argparse
import base64
import hashlib
import json
from pathlib import Path

import pyarrow as pa
import pyarrow.parquet as pq
from build_dataset import DATASETS, ROOT
from datasets.arrow_dataset import Dataset  # type: ignore[import-untyped]


def read_text(path: Path) -> str | None:
    """
    Read file text
    
    :param path: Path to file
    :type path: Path
    :return: The text within
    :rtype: str | None
    """

    try:
        return path.read_text(encoding="utf-8")
    except (UnicodeDecodeError, OSError):
        return None


def iter_artifacts():
    """
    Iterates through artifacts
    """

    for language_dir in sorted(DATASETS.iterdir()):
        if not language_dir.is_dir():
            continue

        language = language_dir.name
        bin_root = language_dir / "bin"
        asm_root = language_dir / "asm"
        source_root = language_dir / "source"

        if not source_root.is_dir():
            continue

        for source in sorted(source_root.rglob("*")):
            if not source.is_file():
                continue

            relative = source.relative_to(source_root)
            tier = relative.parts[0] if relative.parts else ""
            script = source.stem

            if "_A" in script:
                continue

            bin_dir = bin_root / tier
            asm_dir = asm_root / tier

            binary_matches = (
                sorted(bin_dir.glob(f"{script}*")) if bin_dir.is_dir() else []
            )
            assembly_matches = (
                sorted(asm_dir.glob(f"{script}*")) if asm_dir.is_dir() else []
            )

            for binary in binary_matches:
                if not binary.is_file() or binary.suffix == ".zst":
                    continue

                content = binary.read_bytes()
                assembly = next(
                    (
                        item
                        for item in assembly_matches
                        if item.is_file() and item.suffix != ".zst"
                    ),
                    None,
                )

                yield {
                    "language": language,
                    "tier": tier,
                    "script": script,
                    "source_path": str(source.relative_to(ROOT)),
                    "source": read_text(source),
                    "binary_path": str(binary.relative_to(ROOT)),
                    "binary_sha256": hashlib.sha256(content).hexdigest(),
                    "binary_base64": base64.b64encode(content).decode("ascii"),
                    "assembly_path": (
                        str(assembly.relative_to(ROOT)) if assembly is not None else None
                    ),
                    "assembly": read_text(assembly) if assembly is not None else None,
                }


def export_pyarrow(rows, output: Path, shard_size: int) -> list[Path]:
    """
    Export Pyarrow style for dataset
    
    :param rows: Row count for pyarrow
    :param output: Where to output
    :type output: Path
    :param shard_size: How big to make the pyarrows
    :type shard_size: int
    :return: List of pyarrow files
    :rtype: list[Path]
    """

    fields = [
        ("language", pa.string()),
        ("tier", pa.string()),
        ("script", pa.string()),
        ("source_path", pa.string()),
        ("source", pa.string()),
        ("binary_path", pa.string()),
        ("binary_sha256", pa.string()),
        ("binary_base64", pa.string()),
        ("assembly_path", pa.string()),
        ("assembly", pa.string()),
    ]

    schema = pa.schema(fields)
    output.mkdir(parents=True, exist_ok=True)
    shard = []
    paths: list[Path] = []

    for row in rows:
        shard.append(row)
        if len(shard) == shard_size:
            path = output / f"dataset-{len(paths):05d}.parquet"
            pq.write_table(pa.Table.from_pylist(shard, schema=schema), path, compression="zstd")
            paths.append(path)
            shard = []

    if shard:
        path = output / f"dataset-{len(paths):05d}.parquet"
        pq.write_table(pa.Table.from_pylist(shard, schema=schema), path, compression="zstd")
        paths.append(path)

    return paths


def export_datasets(rows, output: Path) -> list[Path]:
    """
    Export final datasets
    
    :param rows: Rows of the dataset
    :param output: Where to output
    :type output: Path
    :return: List of outputs
    :rtype: list[Path]
    """

    dataset = Dataset.from_list(list(rows))
    output.mkdir(parents=True, exist_ok=True)
    path = output / "dataset.parquet"
    dataset.to_parquet(str(path))
    return [path]


def main() -> int:
    """
    Main function for script
    
    :return: Error code
    :rtype: int
    """

    parser = argparse.ArgumentParser(
        description="Export source and compiled artifacts to Zstandard-compressed Parquet."
    )
    parser.add_argument("--output", default="hf-dataset")
    parser.add_argument("--shard-size", type=int, default=500)
    parser.add_argument(
        "--backend",
        choices=("pyarrow", "datasets"),
        default="pyarrow",
    )
    args = parser.parse_args()
    if args.shard_size < 1:
        parser.error("--shard-size must be at least 1")

    rows = list(iter_artifacts())
    output = ROOT / args.output
    if args.backend == "datasets":
        try:
            paths = export_datasets(rows, output)
        except ImportError as exc:
            raise SystemExit(
                "Hugging Face datasets export requires: pip install datasets pyarrow"
            ) from exc
    else:
        try:
            paths = export_pyarrow(rows, output, args.shard_size)
        except ImportError as exc:
            raise SystemExit(
                "Parquet export requires: pip install pyarrow"
            ) from exc

    manifest = {
        "format": "parquet",
        "compression": "zstd",
        "rows": len(rows),
        "files": [
            (
                str(path.relative_to(ROOT))
                if path.is_relative_to(ROOT)
                else str(path)
            )
            for path in paths
        ],
    }

    (output / "manifest.json").write_text(json.dumps(manifest, indent=2) + "\n")
    print(f"Exported {len(rows)} rows to {len(paths)} Parquet shard(s)")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
