import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1565i64 + seed + value

var value = 65i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=SignedOverflow tier=15 seed=65 result=", feature(65i64, value)
