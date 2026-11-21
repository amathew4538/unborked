import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1091i64 + seed + value

var value = 91i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DynamicLinking tier=10 seed=91 result=", feature(91i64, value)
