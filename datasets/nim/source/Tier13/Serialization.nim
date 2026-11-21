import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1344i64 + seed + value

var value = 44i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Serialization tier=13 seed=44 result=", feature(44i64, value)
