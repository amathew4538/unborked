import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1374i64 + seed + value

var value = 74i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=RadixSort tier=13 seed=74 result=", feature(74i64, value)
