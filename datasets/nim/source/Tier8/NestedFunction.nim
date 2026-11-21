import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  861i64 + seed + value

var value = 61i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=NestedFunction tier=8 seed=61 result=", feature(61i64, value)
