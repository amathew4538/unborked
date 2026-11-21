import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  978i64 + seed + value

var value = 78i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=NameMangling tier=9 seed=78 result=", feature(78i64, value)
