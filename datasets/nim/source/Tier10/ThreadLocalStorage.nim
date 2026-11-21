import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1021i64 + seed + value

var value = 21i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ThreadLocalStorage tier=10 seed=21 result=", feature(21i64, value)
