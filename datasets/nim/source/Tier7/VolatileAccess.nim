import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  708i64 + seed + value

var value = 8i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=VolatileAccess tier=7 seed=8 result=", feature(8i64, value)
