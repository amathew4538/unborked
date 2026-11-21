import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1171i64 + seed + value

var value = 71i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=AsyncAwait tier=11 seed=71 result=", feature(71i64, value)
