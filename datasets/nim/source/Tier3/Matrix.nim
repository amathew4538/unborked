let left = [[1, 2, 3], [4, 5, 6]]
let right = [[7, 8], [9, 10], [11, 12]]
for row in 0..<2:
  for column in 0..<2:
    var value = 0
    for inner in 0..<3: value += left[row][inner] * right[inner][column]
    if column == 1: echo value else: stdout.write($value & " ")
