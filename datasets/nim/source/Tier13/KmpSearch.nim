import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1315i64 + seed + value

var value = 15i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=KmpSearch tier=13 seed=15 result=", feature(15i64, value)
