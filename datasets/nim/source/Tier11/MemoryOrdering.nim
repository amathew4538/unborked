import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1149i64 + seed + value

var value = 49i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MemoryOrdering tier=11 seed=49 result=", feature(49i64, value)
