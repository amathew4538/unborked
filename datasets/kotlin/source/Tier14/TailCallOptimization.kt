package datasets.kotlin.source.Tier14

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 59L
    println("feature=TailCallOptimization tier=14 seed=59 result=${feature(59L, value)}")
}
