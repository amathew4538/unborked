import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1437i64 + seed + value

var value = 37i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=RegisterSpilling tier=14 seed=37 result=", feature(37i64, value)
