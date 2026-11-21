import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1142i64 + seed + value

var value = 42i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MemoryFence tier=11 seed=42 result=", feature(42i64, value)
