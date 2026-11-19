package datasets.kotlin.source.Tier9

fun applyFeature(value: Int): Int = value * value + 3

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toIntOrNull() ?: 42
    println("feature=Attributes value=$value result=${applyFeature(value)}")
}
