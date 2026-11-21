package datasets.kotlin.source.Tier7

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 73L
    println("feature=NullPointer tier=7 seed=73 result=${feature(73L, value)}")
}
