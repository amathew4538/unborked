@main def main(): Unit = {
  val processed =
    List(1, 2, 3, 4, 5, 6).filter(_ % 2 == 0).map(value => value * value)
  println(s"processed: ${processed.length}")
  println(s"squares sum: ${processed.sum}")
}
