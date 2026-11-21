import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1316i64 + seed + value

var value = 16i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=DoublyLinkedList tier=13 seed=16 result=", feature(16i64, value)
