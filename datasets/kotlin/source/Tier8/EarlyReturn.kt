package datasets.kotlin.source.Tier8

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 91L
    println("feature=EarlyReturn tier=8 seed=91 result=${feature(91L, value)}")
}
