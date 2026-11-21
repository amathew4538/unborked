import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1145i64 + seed + value

var value = 45i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ParallelReduction tier=11 seed=45 result=", feature(45i64, value)
