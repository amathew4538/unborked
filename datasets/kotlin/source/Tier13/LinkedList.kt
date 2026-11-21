package datasets.kotlin.source.Tier13

fun feature(seed: Long, value: Long): Long {
    val result = seed * 17 + 3L
    return result + seed + value
}

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toLongOrNull() ?: 90L
    println("feature=LinkedList tier=13 seed=90 result=${feature(90L, value)}")
}
