package datasets.kotlin.source.Tier14

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 47L
    println("feature=BoundsCheckElimination tier=14 seed=47 result=${feature(47L, value)}")
}
