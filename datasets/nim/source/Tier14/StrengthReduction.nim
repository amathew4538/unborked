import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1458i64 + seed + value

var value = 58i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StrengthReduction tier=14 seed=58 result=", feature(58i64, value)
