package datasets.kotlin.source.Tier8

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 94L
    println("feature=BreakContinue tier=8 seed=94 result=${feature(94L, value)}")
}
