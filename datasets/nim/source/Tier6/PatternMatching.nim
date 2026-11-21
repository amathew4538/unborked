import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  665i64 + seed + value

var value = 65i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=PatternMatching tier=6 seed=65 result=", feature(65i64, value)
