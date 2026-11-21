import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  670i64 + seed + value

var value = 70i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Comparison tier=6 seed=70 result=", feature(70i64, value)
