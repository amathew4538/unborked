import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1243i64 + seed + value

var value = 43i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=FileWrite tier=12 seed=43 result=", feature(43i64, value)
