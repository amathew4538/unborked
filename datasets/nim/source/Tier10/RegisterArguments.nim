import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1064i64 + seed + value

var value = 64i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=RegisterArguments tier=10 seed=64 result=", feature(64i64, value)
