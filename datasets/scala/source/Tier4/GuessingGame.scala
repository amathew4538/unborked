@main def main(): Unit = {
    val target = 5
    for (turn, guess) <- List(7, 3, 5).zipWithIndex do
      println(s"guess ${turn + 1}: $guess")
      if guess == target then println(s"found: $target")
}
