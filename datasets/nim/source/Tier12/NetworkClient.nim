import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1283i64 + seed + value

var value = 83i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=NetworkClient tier=12 seed=83 result=", feature(83i64, value)
