import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1382i64 + seed + value

var value = 82i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Stack tier=13 seed=82 result=", feature(82i64, value)
