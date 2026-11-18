let limit = 30
var prime = newSeq[bool](limit + 1)
for i in 2..limit: prime[i] = true
for i in 2..cast[int](sqrt(float(limit))):
  if prime[i]:
    var multiple = i * i
    while multiple <= limit:
      prime[multiple] = false
      multiple += i
stdout.write("primes:")
for i in 2..limit: if prime[i]: stdout.write(" " & $i)
echo ""
