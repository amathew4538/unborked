import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1432i64 + seed + value

var value = 32i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DeadCodeElimination tier=14 seed=32 result=", feature(32i64, value)
