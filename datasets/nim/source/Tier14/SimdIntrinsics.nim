import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1481i64 + seed + value

var value = 81i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=SimdIntrinsics tier=14 seed=81 result=", feature(81i64, value)
