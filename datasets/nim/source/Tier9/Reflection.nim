import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  952i64 + seed + value

var value = 52i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Reflection tier=9 seed=52 result=", feature(52i64, value)
