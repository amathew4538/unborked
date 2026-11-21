import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  734i64 + seed + value

var value = 34i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Pointer tier=7 seed=34 result=", feature(34i64, value)
