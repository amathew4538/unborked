@main def main(args: String*): Unit = {
  val seed = 24L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (24*17+3) + seed + value
  println(s"feature=BitwiseOr tier=6 seed=$seed result=$result")
}
