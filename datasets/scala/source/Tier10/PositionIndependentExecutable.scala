@main def main(args: String*): Unit = {
  val seed = 50L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (50+32) + seed + value
  println(s"feature=PositionIndependentExecutable tier=10 seed=$seed result=$result")
}
