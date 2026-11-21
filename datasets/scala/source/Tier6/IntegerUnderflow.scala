@main def main(args: String*): Unit = {
  val seed = 67L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (67*17+3) + seed + value
  println(s"feature=IntegerUnderflow tier=6 seed=$seed result=$result")
}
