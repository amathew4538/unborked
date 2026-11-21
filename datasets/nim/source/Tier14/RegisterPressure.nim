import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1466i64 + seed + value

var value = 66i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=RegisterPressure tier=14 seed=66 result=", feature(66i64, value)
