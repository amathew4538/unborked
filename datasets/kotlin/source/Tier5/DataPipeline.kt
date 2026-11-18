package datasets.kotlin.source.Tier5

fun main() {
    val processed = listOf(1, 2, 3, 4, 5, 6).filter { it % 2 == 0 }.map { it * it }
    println("processed: ${processed.size}")
    println("squares sum: ${processed.sum()}")
}
