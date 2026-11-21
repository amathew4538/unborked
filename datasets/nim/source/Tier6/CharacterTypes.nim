import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  630i64 + seed + value

var value = 30i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=CharacterTypes tier=6 seed=30 result=", feature(30i64, value)
