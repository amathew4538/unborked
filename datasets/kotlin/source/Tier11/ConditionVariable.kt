package datasets.kotlin.source.Tier11

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 72L
    println("feature=ConditionVariable tier=11 seed=72 result=${feature(72L, value)}")
}
