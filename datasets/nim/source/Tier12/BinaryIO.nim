import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1238i64 + seed + value

var value = 38i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BinaryIO tier=12 seed=38 result=", feature(38i64, value)
