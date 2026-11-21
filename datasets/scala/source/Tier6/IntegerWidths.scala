@main def main(args: String*): Unit = {
  val seed = 21L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (21*17+3) + seed + value
  println(s"feature=IntegerWidths tier=6 seed=$seed result=$result")
}
