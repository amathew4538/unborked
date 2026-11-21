import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1310i64 + seed + value

var value = 10i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Checksum tier=13 seed=10 result=", feature(10i64, value)
