import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  725i64 + seed + value

var value = 25i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MemoryMove tier=7 seed=25 result=", feature(25i64, value)
