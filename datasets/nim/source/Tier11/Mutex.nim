import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1114i64 + seed + value

var value = 14i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Mutex tier=11 seed=14 result=", feature(14i64, value)
