import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  948i64 + seed + value

var value = 48i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Interface tier=9 seed=48 result=", feature(48i64, value)
