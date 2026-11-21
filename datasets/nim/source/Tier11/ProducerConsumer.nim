import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1175i64 + seed + value

var value = 75i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=ProducerConsumer tier=11 seed=75 result=", feature(75i64, value)
