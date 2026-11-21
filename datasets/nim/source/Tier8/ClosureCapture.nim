import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  802i64 + seed + value

var value = 2i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ClosureCapture tier=8 seed=2 result=", feature(2i64, value)
