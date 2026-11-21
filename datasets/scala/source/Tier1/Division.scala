def divide(a: Int, b: Int): Int = a / b
@main def main(): Unit = {
  println(divide(0, 1))
  println(divide(7, 13))
  println(divide(65536, 1000))
  println(divide(64, 8))
  println(divide(-42, -1))
}
