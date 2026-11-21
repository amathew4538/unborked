import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1518i64 + seed + value

var value = 18i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=InvalidShift tier=15 seed=18 result=", feature(18i64, value)
