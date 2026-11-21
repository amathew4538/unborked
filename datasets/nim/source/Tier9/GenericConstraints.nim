import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  976i64 + seed + value

var value = 76i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=GenericConstraints tier=9 seed=76 result=", feature(76i64, value)
