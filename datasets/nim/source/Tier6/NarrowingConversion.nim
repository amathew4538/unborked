import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  693i64 + seed + value

var value = 93i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=NarrowingConversion tier=6 seed=93 result=", feature(93i64, value)
