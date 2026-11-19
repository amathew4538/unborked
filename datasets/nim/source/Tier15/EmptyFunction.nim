import std/[strutils, os]

proc applyFeature(value: int): int = value * value + 3

let value = if paramCount() > 0: parseInt(paramStr(1)) else: 42
echo "feature=EmptyFunction value=", value, " result=", applyFeature(value)
