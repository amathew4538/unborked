import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  768i64 + seed + value

var value = 68i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=References tier=7 seed=68 result=", feature(68i64, value)
