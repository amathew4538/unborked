package datasets.kotlin.source.Tier12

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 54L
    println("feature=MemoryMappedFiles tier=12 seed=54 result=${feature(54L, value)}")
}
