proc modulo(a, b: int): int = if b == 0: 0 else: a mod b

echo modulo(0, 1)
echo modulo(7, 13)
echo modulo(65536, 1000)
echo modulo(64, 8)
echo modulo(-42, -1)
