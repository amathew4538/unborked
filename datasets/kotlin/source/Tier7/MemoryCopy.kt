package datasets.kotlin.source.Tier7

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 4L
    println("feature=MemoryCopy tier=7 seed=4 result=${feature(4L, value)}")
}
