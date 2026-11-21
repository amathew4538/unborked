import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1189i64 + seed + value

var value = 89i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Promise tier=11 seed=89 result=", feature(89i64, value)
