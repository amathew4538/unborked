import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1037i64 + seed + value

var value = 37i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ExceptionUnwinding tier=10 seed=37 result=", feature(37i64, value)
