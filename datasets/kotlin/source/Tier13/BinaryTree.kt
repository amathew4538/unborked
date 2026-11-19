package datasets.kotlin.source.Tier13

fun applyFeature(value: Int): Int = value * value + 3

fun main(args: Array<String>) {
    val value = args.firstOrNull()?.toIntOrNull() ?: 42
    println("feature=BinaryTree value=$value result=${applyFeature(value)}")
}
