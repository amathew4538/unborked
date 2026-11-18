package datasets.kotlin.source.Tier3

fun main() {
    val input = "Hello World!"
    println("upper: ${input.uppercase()}")
    println("reverse: ${input.reversed()}")
    println("words: ${input.split("\s+".toRegex()).size}")
}
