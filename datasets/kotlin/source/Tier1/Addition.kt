package datasets.kotlin.source.Tier1

fun add(a: Int, b: Int) = a + b

fun main() {
    println(add(0,1))
    println(add(7,13))
    println(add(65536,1000))
    println(add(64,8))
    println(add(-42,-1));
}
