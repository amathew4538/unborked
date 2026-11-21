import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1050i64 + seed + value

var value = 50i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=PositionIndependentExecutable tier=10 seed=50 result=", feature(50i64, value)
