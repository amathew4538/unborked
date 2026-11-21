import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1441i64 + seed + value

var value = 41i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=FunctionInlining tier=14 seed=41 result=", feature(41i64, value)
