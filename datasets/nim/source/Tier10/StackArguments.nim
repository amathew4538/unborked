import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1086i64 + seed + value

var value = 86i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StackArguments tier=10 seed=86 result=", feature(86i64, value)
