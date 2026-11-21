package datasets.kotlin.source.Tier12

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 46L
    println("feature=CommandLineArguments tier=12 seed=46 result=${feature(46L, value)}")
}
