package datasets.kotlin.source.Tier8

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 35L
    println("feature=Generator tier=8 seed=35 result=${feature(35L, value)}")
}
