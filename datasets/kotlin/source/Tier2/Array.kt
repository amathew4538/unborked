package datasets.kotlin.source.Tier2

fun main() {
    val values = intArrayOf(2, 4, 6, 8, 10)
    var sum = 0
    for (value in values) {
        println(value)
        sum += value
    }
    println(sum)
}
