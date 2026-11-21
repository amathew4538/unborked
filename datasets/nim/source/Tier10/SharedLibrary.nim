import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1039i64 + seed + value

var value = 39i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=SharedLibrary tier=10 seed=39 result=", feature(39i64, value)
