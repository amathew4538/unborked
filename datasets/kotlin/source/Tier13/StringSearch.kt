package datasets.kotlin.source.Tier13

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 30L
    println("feature=StringSearch tier=13 seed=30 result=${feature(30L, value)}")
}
