def power(a: Int, b: Int): Int = (1 to b).foldLeft(1)((r, _) => r * a)
@main def main(): Unit = {
    println(power(2, 8))
println(power(3, 4));
}
