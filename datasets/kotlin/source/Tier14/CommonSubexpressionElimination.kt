package datasets.kotlin.source.Tier14

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 52L
    println("feature=CommonSubexpressionElimination tier=14 seed=52 result=${feature(52L, value)}")
}
