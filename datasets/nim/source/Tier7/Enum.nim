import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  709i64 + seed + value

var value = 9i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Enum tier=7 seed=9 result=", feature(9i64, value)
