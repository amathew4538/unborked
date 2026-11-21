import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  687i64 + seed + value

var value = 87i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=FloatingPointRounding tier=6 seed=87 result=", feature(87i64, value)
