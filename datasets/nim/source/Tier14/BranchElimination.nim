import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1405i64 + seed + value

var value = 5i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BranchElimination tier=14 seed=5 result=", feature(5i64, value)
