# Unborked

## _**Is your program borked? Unbork it with Unborked AI!**_

A decompilation AI dedicated to as many compiled languages we can shove in!

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
