@main def main(args: String*): Unit = {
  val seed = 65L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (65*17+3) + seed + value
  println(s"feature=PatternMatching tier=6 seed=$seed result=$result")
}
