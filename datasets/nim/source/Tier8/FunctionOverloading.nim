import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  820i64 + seed + value

var value = 20i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=FunctionOverloading tier=8 seed=20 result=", feature(20i64, value)
