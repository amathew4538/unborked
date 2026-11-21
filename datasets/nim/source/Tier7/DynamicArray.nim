import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  750i64 + seed + value

var value = 50i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DynamicArray tier=7 seed=50 result=", feature(50i64, value)
