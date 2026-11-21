import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1272i64 + seed + value

var value = 72i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DirectoryOperations tier=12 seed=72 result=", feature(72i64, value)
