import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  760i64 + seed + value

var value = 60i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Slice tier=7 seed=60 result=", feature(60i64, value)
