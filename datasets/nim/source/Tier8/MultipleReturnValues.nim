import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  803i64 + seed + value

var value = 3i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MultipleReturnValues tier=8 seed=3 result=", feature(3i64, value)
