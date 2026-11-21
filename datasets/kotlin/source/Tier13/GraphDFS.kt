package datasets.kotlin.source.Tier13

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 16L
    println("feature=GraphDFS tier=13 seed=16 result=${feature(16L, value)}")
}
