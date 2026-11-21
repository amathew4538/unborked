import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1240i64 + seed + value

var value = 40i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=FileMetadata tier=12 seed=40 result=", feature(40i64, value)
