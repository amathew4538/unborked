package datasets.kotlin.source.Tier9

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 83L
    println("feature=CompileTimeEvaluation tier=9 seed=83 result=${feature(83L, value)}")
}
