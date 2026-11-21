@main def main(args: String*): Unit = {
  val seed = 59L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (59*17+3) + seed + value
  println(s"feature=WideningConversion tier=6 seed=$seed result=$result")
}
