import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1537i64 + seed + value

var value = 37i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=UndefinedBehavior tier=15 seed=37 result=", feature(37i64, value)
