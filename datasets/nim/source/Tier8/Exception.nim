import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  829i64 + seed + value

var value = 29i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Exception tier=8 seed=29 result=", feature(29i64, value)
