package datasets.kotlin.source.Tier11

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 0L
    println("feature=ThreadLocalVariables tier=11 seed=0 result=${feature(0L, value)}")
}
