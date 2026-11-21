import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1413i64 + seed + value

var value = 13i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=LoopVectorization tier=14 seed=13 result=", feature(13i64, value)
