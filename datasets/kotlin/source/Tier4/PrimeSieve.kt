package datasets.kotlin.source.Tier4

fun main() {
    val limit = 30
    val prime = BooleanArray(limit + 1) { it >= 2 }
    for (i in 2..limit) if (i * i <= limit && prime[i]) {
        var multiple = i * i
        while (multiple <= limit) { prime[multiple] = false; multiple += i }
    }
    print("primes:")
    for (i in 2..limit) if (prime[i]) print(" $i")
    println()
}
