@main def main(): Unit = {
    val left = Array(Array(1, 2, 3), Array(4, 5, 6))
    val right = Array(Array(7, 8), Array(9, 10), Array(11, 12))
    for row <- 0 until 2 do
      for column <- 0 until 2 do
        val value = (0 until 3).map(inner => left(row)(inner) * right(inner)(column)).sum
        print(value.toString + (if column == 1 then "\n" else " "))
}
