import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  784i64 + seed + value

var value = 84i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=MemoryPadding tier=7 seed=84 result=", feature(84i64, value)
