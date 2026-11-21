package datasets.kotlin.source.Tier10

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 86L
    println("feature=CInterop tier=10 seed=86 result=${feature(86L, value)}")
}
