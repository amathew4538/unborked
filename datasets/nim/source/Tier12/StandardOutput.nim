import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1223i64 + seed + value

var value = 23i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StandardOutput tier=12 seed=23 result=", feature(23i64, value)
