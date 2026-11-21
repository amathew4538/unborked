import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1352i64 + seed + value

var value = 52i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Compression tier=13 seed=52 result=", feature(52i64, value)
