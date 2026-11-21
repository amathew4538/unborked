import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  863i64 + seed + value

var value = 63i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=TailRecursion tier=8 seed=63 result=", feature(63i64, value)
