import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1090i64 + seed + value

var value = 90i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StackFrame tier=10 seed=90 result=", feature(90i64, value)
