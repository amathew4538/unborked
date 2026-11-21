import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  900i64 + seed + value

var value = 0i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MultipleInheritance tier=9 seed=0 result=", feature(0i64, value)
