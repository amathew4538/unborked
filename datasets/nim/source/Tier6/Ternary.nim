import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  677i64 + seed + value

var value = 77i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Ternary tier=6 seed=77 result=", feature(77i64, value)
