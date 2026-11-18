package datasets.kotlin.source.Tier4

fun main() {
    val target = 5
    for ((turn, guess) in listOf(7, 3, 5).withIndex()) {
        println("guess ${turn + 1}: $guess")
        if (guess == target) { println("found: $target"); break }
    }
}
