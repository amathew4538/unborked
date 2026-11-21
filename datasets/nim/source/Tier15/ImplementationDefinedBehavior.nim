import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1507i64 + seed + value

var value = 7i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ImplementationDefinedBehavior tier=15 seed=7 result=", feature(7i64, value)
