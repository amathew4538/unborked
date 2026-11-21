import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1224i64 + seed + value

var value = 24i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StandardInput tier=12 seed=24 result=", feature(24i64, value)
