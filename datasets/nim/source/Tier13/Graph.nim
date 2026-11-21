import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1306i64 + seed + value

var value = 6i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Graph tier=13 seed=6 result=", feature(6i64, value)
