import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1383i64 + seed + value

var value = 83i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BinaryTree tier=13 seed=83 result=", feature(83i64, value)
