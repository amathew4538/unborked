package datasets.kotlin.source.Tier6

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 9L
    println("feature=SignedUnsigned tier=6 seed=9 result=${feature(9L, value)}")
}
