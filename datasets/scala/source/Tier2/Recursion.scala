def factorial(n: Int): Int = if n <= 1 then 1 else n * factorial(n - 1)
@main def main(): Unit = println(factorial(5))
