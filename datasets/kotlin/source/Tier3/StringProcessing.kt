package datasets.kotlin.source.Tier3

fun main() {
    val input = "Hello World!"
    println("upper: ${input.uppercase()}")
    println("reverse: ${input.reversed()}")
    println("words: ${input.split(Regex("\\s+")).size}")
}
