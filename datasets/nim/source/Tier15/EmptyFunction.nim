import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1579i64 + seed + value

var value = 79i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=EmptyFunction tier=15 seed=79 result=", feature(79i64, value)
