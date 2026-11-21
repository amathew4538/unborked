import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1196i64 + seed + value

var value = 96i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DataRace tier=11 seed=96 result=", feature(96i64, value)
