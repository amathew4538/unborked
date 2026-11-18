package datasets.kotlin.source.Tier5

fun main() {
    val grid = Array(5) { BooleanArray(5) }
    grid[1][2] = true; grid[2][2] = true; grid[3][2] = true
    val next = Array(5) { BooleanArray(5) }
    for (row in 0 until 5) for (column in 0 until 5) {
        var neighbours = 0
        for (dy in -1..1) for (dx in -1..1) {
            if (dx == 0 && dy == 0) continue
            val y = row + dy; val x = column + dx
            if (y in 0 until 5 && x in 0 until 5 && grid[y][x]) neighbours++
        }
        next[row][column] = neighbours == 3 || (grid[row][column] && neighbours == 2)
    }
    println("generation: 1")
    for (row in next) { println(row.joinToString("", "", "") { if (it) "#" else "." }) }
}
