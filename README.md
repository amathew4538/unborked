# Unborked

## _**Is your program borked? Unbork it with Unborked AI!**_

A decompilation AI dedicated to as many compiled languages we can shove in!

## C build, Parquet export, and cleanup

Build only C, create Hugging Face-compatible Zstandard Parquet shards, and
delete the generated C binaries and assembly after export:

```bash
python3 scripts/build_dataset.py --languages c --clean all --parquet --parquet-output hf-dataset --clean-artifacts-after-export
```

This keeps `datasets/c/source/**` and `hf-dataset/**`, while removing files under
`datasets/c/bin/**` and `datasets/c/asm/**` after export. Zstandard raw
artifact copies can be requested separately:

```bash
python3 scripts/build_dataset.py --languages c --zstd --zstd-level 19
```

## Build C and export Parquet

Build C at all configured optimization levels, export source/binary/assembly
records to Zstandard-compressed Parquet, then remove the generated C binary and
assembly directories:

```bash
python3 scripts/build_dataset.py --clean all --languages c --parquet --parquet-output hf-dataset --clean-artifacts-after-export
```

The final Parquet export contains source text, assembly text, binary Base64,
SHA-256 hashes, language, tier, and script metadata. `--clean-artifacts-after-export`
only removes files below `datasets/<language>/bin` and `datasets/<language>/asm`;
source files and the exported Parquet files are preserved.

## Compression and Hugging Face export

Create Zstandard copies of binaries and assembly artifacts after a build:

```bash
python3 scripts/build_dataset.py --languages c cpp go rust --zstd
python3 scripts/build_dataset.py --languages c cpp go rust --zstd --zstd-delete-original
```

By default, originals are preserved. Use `--zstd-level` to select compression
level 19 (the default) or a lower value for faster builds.

Export source and compiled artifacts to Zstandard-compressed Parquet shards:

```bash
python3 scripts/export_hf_dataset.py --backend pyarrow --shard-size 500 --output hf-dataset
python3 scripts/export_hf_dataset.py --backend datasets --output hf-dataset
```

Parquet export requires `pyarrow`; Hugging Face `datasets` export additionally
requires the `datasets` package. The Parquet exporter writes source text,
assembly text, binary Base64, hashes, language, tier, and script metadata.
