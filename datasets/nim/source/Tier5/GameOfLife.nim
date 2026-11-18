var grid = newSeqWith(5, newSeq[bool](5))
grid[1][2] = true
grid[2][2] = true
grid[3][2] = true
echo "generation: 1"
for row in 0..<5:
  for column in 0..<5: stdout.write(if grid[row][column]: "#" else: ".")
  echo ""
