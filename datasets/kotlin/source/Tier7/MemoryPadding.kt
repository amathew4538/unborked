package datasets.kotlin.source.Tier7

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 84L
    println("feature=MemoryPadding tier=7 seed=84 result=${feature(84L, value)}")
}
