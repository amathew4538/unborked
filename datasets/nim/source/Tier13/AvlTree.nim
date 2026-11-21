import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1331i64 + seed + value

var value = 31i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=AvlTree tier=13 seed=31 result=", feature(31i64, value)
