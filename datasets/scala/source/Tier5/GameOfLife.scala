@main def main(): Unit = {
    val grid = Array.fill(5, 5)(false)
    grid(1)(2) = true
    grid(2)(2) = true
    grid(3)(2) = true

    val next = Array.fill(5, 5)(false)
    for row <- 0 until 5 do
        for column <- 0 until 5 do
            var neighbours = 0
            for dy <- -1 to 1 do
                for dx <- -1 to 1 do
                    if dx != 0 || dy != 0 then
                        val y = row + dy
                        val x = column + dx
                        if y >= 0 && y < 5 && x >= 0 && x < 5 && grid(y)(x) then
                            neighbours += 1
            next(row)(column) = neighbours == 3 || (grid(row)(column) && neighbours == 2)

    println("generation: 1")
    for row <- next do
        println(row.map(cell => if cell then '#' else '.').mkString)
}
