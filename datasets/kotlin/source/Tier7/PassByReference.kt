package datasets.kotlin.source.Tier7

fun applyFeature(value: Int): Int = value * value + 3

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toIntOrNull() ?: 42
    println("feature=PassByReference value=$value result=${applyFeature(value)}")
}
