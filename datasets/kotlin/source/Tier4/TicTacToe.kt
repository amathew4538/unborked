package datasets.kotlin.source.Tier4

fun main() {
    val board = arrayOf(charArrayOf('X', 'O', 'X'), charArrayOf('O', 'X', 'O'), charArrayOf('X', 'O', 'X'))
    for (row in board) println(row.joinToString(" "))
    println("winner: X")
}
