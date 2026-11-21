import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1088i64 + seed + value

var value = 88i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=PositionIndependentCode tier=10 seed=88 result=", feature(88i64, value)
