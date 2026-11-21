import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  894i64 + seed + value

var value = 94i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=BreakContinue tier=8 seed=94 result=", feature(94i64, value)
