import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1026i64 + seed + value

var value = 26i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StaticLinking tier=10 seed=26 result=", feature(26i64, value)
