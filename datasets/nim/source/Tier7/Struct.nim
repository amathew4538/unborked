import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  785i64 + seed + value

var value = 85i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Struct tier=7 seed=85 result=", feature(85i64, value)
