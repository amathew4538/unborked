import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  751i64 + seed + value

var value = 51i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StackAllocation tier=7 seed=51 result=", feature(51i64, value)
