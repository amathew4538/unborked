import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  934i64 + seed + value

var value = 34i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StaticFields tier=9 seed=34 result=", feature(34i64, value)
