package datasets.kotlin.source.Tier3

fun main() {
    val left = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
    val right = arrayOf(intArrayOf(7, 8), intArrayOf(9, 10), intArrayOf(11, 12))
    for (row in 0 until 2) {
        for (column in 0 until 2) {
            val value = (0 until 3).sumOf { left[row][it] * right[it][column] }
            print(value.toString() + if (column == 1) "\n" else " ")
        }
    }
}
