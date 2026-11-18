let input = @[1, 2, 3, 4, 5, 6]
let processed = input.filter(proc(value: int): bool = value mod 2 == 0).map(proc(value: int): int = value * value)
echo "processed: ", processed.len
echo "squares sum: ", processed.foldl(a + b)
