import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  844i64 + seed + value

var value = 44i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ErrorPropagation tier=8 seed=44 result=", feature(44i64, value)
