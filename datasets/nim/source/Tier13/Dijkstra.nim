import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1386i64 + seed + value

var value = 86i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=Dijkstra tier=13 seed=86 result=", feature(86i64, value)
