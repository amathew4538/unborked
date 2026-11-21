import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1172i64 + seed + value

var value = 72i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ConditionVariable tier=11 seed=72 result=", feature(72i64, value)
