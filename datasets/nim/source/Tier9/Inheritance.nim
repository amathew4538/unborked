import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  901i64 + seed + value

var value = 1i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Inheritance tier=9 seed=1 result=", feature(1i64, value)
