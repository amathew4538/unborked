package datasets.kotlin.source.Tier2

fun classify(n: Int): String = if (n < 0) "negative" else if (n > 0) "positive" else "zero"

fun main() {
    println(classify(-1))
    println(classify(0))
    println(classify(1))
}
