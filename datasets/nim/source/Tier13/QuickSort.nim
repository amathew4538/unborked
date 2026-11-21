import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1339i64 + seed + value

var value = 39i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=QuickSort tier=13 seed=39 result=", feature(39i64, value)
