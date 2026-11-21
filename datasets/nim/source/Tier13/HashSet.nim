import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1347i64 + seed + value

var value = 47i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=HashSet tier=13 seed=47 result=", feature(47i64, value)
