import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1254i64 + seed + value

var value = 54i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MemoryMappedFiles tier=12 seed=54 result=", feature(54i64, value)
