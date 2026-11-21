import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1459i64 + seed + value

var value = 59i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=TailCallOptimization tier=14 seed=59 result=", feature(59i64, value)
