import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  993i64 + seed + value

var value = 93i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=RuntimeTypeInformation tier=9 seed=93 result=", feature(93i64, value)
