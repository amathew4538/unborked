proc power(a, b: int): int =
  var result = 1
  for _ in 0..<b:
    result *= a
  result

echo power(2, 8)
echo power(3, 4)
