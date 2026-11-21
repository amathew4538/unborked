import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  987i64 + seed + value

var value = 87i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Constructor tier=9 seed=87 result=", feature(87i64, value)
