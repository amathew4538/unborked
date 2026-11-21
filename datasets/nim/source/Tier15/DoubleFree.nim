import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1568i64 + seed + value

var value = 68i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DoubleFree tier=15 seed=68 result=", feature(68i64, value)
