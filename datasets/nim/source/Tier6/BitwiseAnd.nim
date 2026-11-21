import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  603i64 + seed + value

var value = 3i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BitwiseAnd tier=6 seed=3 result=", feature(3i64, value)
