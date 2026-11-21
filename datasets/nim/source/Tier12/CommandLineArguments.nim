import std/[os, strutils]

proc feature(seed, value: int64): int64 =
  1246i64 + seed + value

var value = 46i64
if paramCount() > 0:
  value = parseBiggestInt(paramStr(1))
echo "feature=CommandLineArguments tier=12 seed=46 result=", feature(46i64, value)
