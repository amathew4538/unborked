import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1492i64 + seed + value

var value = 92i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BranchlessOperations tier=14 seed=92 result=", feature(92i64, value)
