import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1261i64 + seed + value

var value = 61i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=SystemCall tier=12 seed=61 result=", feature(61i64, value)
