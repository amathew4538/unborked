import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  975i64 + seed + value

var value = 75i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=InstanceFields tier=9 seed=75 result=", feature(75i64, value)
