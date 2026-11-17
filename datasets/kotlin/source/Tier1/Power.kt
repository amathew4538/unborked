package datasets.kotlin.source.Tier1

fun power(a: Int, b: Int): Int { var result=1; repeat(b) { result*=a }; return result }
fun main() {
    println(power(2, 8))
println(power(3, 4));
}
