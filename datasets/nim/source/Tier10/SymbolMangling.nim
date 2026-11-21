import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1038i64 + seed + value

var value = 38i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=SymbolMangling tier=10 seed=38 result=", feature(38i64, value)
