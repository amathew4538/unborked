package datasets.kotlin.source.Tier10

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 39L
    println("feature=SharedLibrary tier=10 seed=39 result=${feature(39L, value)}")
}
