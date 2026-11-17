package datasets.kotlin.source.Tier2

fun factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)

fun main() {
    println(factorial(5))
}
