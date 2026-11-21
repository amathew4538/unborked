import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  627i64 + seed + value

var value = 27i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Constants tier=6 seed=27 result=", feature(27i64, value)
