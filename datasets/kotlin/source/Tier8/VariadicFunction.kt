package datasets.kotlin.source.Tier8

fun applyFeature(value: Int): Int = value * value + 3

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toIntOrNull() ?: 42
    println("feature=VariadicFunction value=$value result=${applyFeature(value)}")
}
