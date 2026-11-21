import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1528i64 + seed + value

var value = 28i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ConstantExpression tier=15 seed=28 result=", feature(28i64, value)
