package datasets.kotlin.source.Tier6

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 30L
    println("feature=FloatingPointSpecialValues tier=6 seed=30 result=${feature(30L, value)}")
}
