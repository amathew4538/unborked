@main def main(args: String*): Unit = {
  val seed = 85L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (85*17+3) + seed + value
  println(s"feature=IntegerOverflow tier=6 seed=$seed result=$result")
}
