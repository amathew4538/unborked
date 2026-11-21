@main def main(args: String*): Unit = {
  val seed = 46L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (46*17+3) + seed + value
  println(s"feature=ExplicitConversion tier=6 seed=$seed result=$result")
}
