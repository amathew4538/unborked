@main def main(): Unit = {
    val values = Array(2, 4, 6, 8, 10)
    var sum = 0
    for value <- values do
        println(value)
        sum += value
    println(sum)
}
