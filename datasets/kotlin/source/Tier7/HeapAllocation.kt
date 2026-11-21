package datasets.kotlin.source.Tier7

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 49L
    println("feature=HeapAllocation tier=7 seed=49 result=${feature(49L, value)}")
}
