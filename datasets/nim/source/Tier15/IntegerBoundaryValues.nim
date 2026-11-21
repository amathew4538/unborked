import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1523i64 + seed + value

var value = 23i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=IntegerBoundaryValues tier=15 seed=23 result=", feature(23i64, value)
