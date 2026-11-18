@main def main(): Unit = {
    val board = Array(Array("X", "O", "X"), Array("O", "X", "O"), Array("X", "O", "X"))
    for row <- board do println(row.mkString(" "))
    println("winner: X")
}
