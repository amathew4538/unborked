proc classify(n: int): string =
  if n < 0: "negative"
  elif n > 0: "positive"
  else: "zero"

echo classify(-1)
echo classify(0)
echo classify(1)
