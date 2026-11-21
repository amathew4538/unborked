import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  957i64 + seed + value

var value = 57i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Namespaces tier=9 seed=57 result=", feature(57i64, value)
