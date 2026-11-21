import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  645i64 + seed + value

var value = 45i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=StringLiterals tier=6 seed=45 result=", feature(45i64, value)
