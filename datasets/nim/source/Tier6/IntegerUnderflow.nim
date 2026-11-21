import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  667i64 + seed + value

var value = 67i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=IntegerUnderflow tier=6 seed=67 result=", feature(67i64, value)
