package datasets.kotlin.source.Tier14

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 5L
    println("feature=BranchElimination tier=14 seed=5 result=${feature(5L, value)}")
}
