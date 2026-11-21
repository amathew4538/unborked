package datasets.kotlin.source.Tier15

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 62L
    println("feature=UnspecifiedBehavior tier=15 seed=62 result=${feature(62L, value)}")
}
