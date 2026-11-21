import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1330i64 + seed + value

var value = 30i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StringSearch tier=13 seed=30 result=", feature(30i64, value)
