import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  873i64 + seed + value

var value = 73i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Assertion tier=8 seed=73 result=", feature(73i64, value)
