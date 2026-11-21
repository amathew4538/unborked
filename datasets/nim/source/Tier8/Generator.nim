import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  835i64 + seed + value

var value = 35i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Generator tier=8 seed=35 result=", feature(35i64, value)
