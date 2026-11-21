def classify(n: Int): String =
  if (n < 0) "negative" else if (n > 0) "positive" else "zero"

@main def main(): Unit = {
  println(classify(-1))
  println(classify(0))
  println(classify(1))
}
