import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1326i64 + seed + value

var value = 26i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=HashTable tier=13 seed=26 result=", feature(26i64, value)
