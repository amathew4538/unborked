import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1536i64 + seed + value

var value = 36i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=UseAfterFree tier=15 seed=36 result=", feature(36i64, value)
