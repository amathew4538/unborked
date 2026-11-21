import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1585i64 + seed + value

var value = 85i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=LargeStackFrame tier=15 seed=85 result=", feature(85i64, value)
