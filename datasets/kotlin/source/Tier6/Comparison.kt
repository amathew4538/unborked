package datasets.kotlin.source.Tier6

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 70L
    println("feature=Comparison tier=6 seed=70 result=${feature(70L, value)}")
}
