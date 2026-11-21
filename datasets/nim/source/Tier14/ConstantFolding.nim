import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1404i64 + seed + value

var value = 4i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ConstantFolding tier=14 seed=4 result=", feature(4i64, value)
