import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1211i64 + seed + value

var value = 11i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ProcessExit tier=12 seed=11 result=", feature(11i64, value)
