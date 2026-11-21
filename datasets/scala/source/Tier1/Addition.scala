def add(a: Int, b: Int): Int = a + b

@main def main(): Unit = {
  println(add(0, 1))
  println(add(7, 13))
  println(add(65536, 1000))
  println(add(64, 8))
  println(add(-42, -1))
}
