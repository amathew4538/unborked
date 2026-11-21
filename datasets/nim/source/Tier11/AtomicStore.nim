import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1157i64 + seed + value

var value = 57i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=AtomicStore tier=11 seed=57 result=", feature(57i64, value)
