import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1517i64 + seed + value

var value = 17i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=LargeGlobalArray tier=15 seed=17 result=", feature(17i64, value)
