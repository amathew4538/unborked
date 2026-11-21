import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  762i64 + seed + value

var value = 62i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Union tier=7 seed=62 result=", feature(62i64, value)
