let target = 5
for turn, guess in [7, 3, 5]:
  echo "guess ", turn + 1, ": ", guess
  if guess == target:
    echo "found: ", target
    break
