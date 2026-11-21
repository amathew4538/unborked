"""Create comment/format-only source variants for dataset scaling."""

from __future__ import annotations

import argparse
import shutil
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
DATASETS = ROOT / "datasets"

COMMENT_PREFIXES = {
    ".c": "//",
    ".cpp": "//",
    ".cs": "//",
    ".d": "//",
    ".go": "//",
    ".java": "//",
    ".js": "//",
    ".kt": "//",
    ".m": "//",
    ".nim": "#",
    ".rs": "//",
    ".swift": "//",
    ".v": "//",
    ".hs": "--",
    ".scala": "//",
    ".clj": ";",
}


def augment_source(source: Path, copies: int) -> list[Path]:
    """Create reproducible comment-only variants beside a source file."""
    created: list[Path] = []
    prefix = COMMENT_PREFIXES.get(source.suffix, "//")

    for copy_number in range(1, copies + 1):
        variant_name = f"{source.stem}_A{copy_number:02d}"
        if source.suffix == ".go":
            variant_dir = source.parent.parent / variant_name
            variant_dir.mkdir(parents=True, exist_ok=True)
            variant = variant_dir / f"{variant_name}.go"
        else:
            variant = source.with_name(f"{variant_name}{source.suffix}")
        text = source.read_text(encoding="utf-8")
        header = f"{prefix} Dataset augmentation variant {copy_number:02d}\n"
        variant.write_text(header + text, encoding="utf-8")
        created.append(variant)
    return created


def main() -> int:
    """
    Main function
    
    :return: Error Code
    :rtype: int
    """
    parser = argparse.ArgumentParser(
        description="Create semantic-preserving comment variants for source files."
    )
    parser.add_argument("--copies", type=int, default=4)
    parser.add_argument("--clean", action="store_true", help="Remove existing _A source variants")
    parser.add_argument(
        "--languages",
        nargs="+",
        help="Language directories to augment (default: all)",
    )
    args = parser.parse_args()
    if args.copies < 0:
        parser.error("--copies must be zero or greater")

    languages = args.languages or sorted(path.name for path in DATASETS.iterdir() if path.is_dir())
    created = 0
    for language in languages:
        source_root = DATASETS / language / "source"
        if not source_root.is_dir():
            continue
        for source in sorted(source_root.rglob("*")):
            if not source.is_file() or "_A" in source.stem:
                continue
            if args.clean:
                for variant in source.parent.glob(f"{source.stem}_A*{source.suffix}"):
                    variant.unlink()
                if source.suffix == ".go":
                    for variant_dir in source.parent.parent.glob(f"{source.stem}_A*"):
                        if variant_dir.is_dir():
                            shutil.rmtree(variant_dir)
                continue
            if source.suffix not in COMMENT_PREFIXES:
                continue
            created += len(augment_source(source, args.copies))

    print(f"Created {created} augmented source variants")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
