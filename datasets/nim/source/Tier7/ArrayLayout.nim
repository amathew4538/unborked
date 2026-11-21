import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  795i64 + seed + value

var value = 95i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ArrayLayout tier=7 seed=95 result=", feature(95i64, value)
