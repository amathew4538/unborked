@main def main(args: String*): Unit = {
  val seed = 88L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (88+32) + seed + value
  println(s"feature=PositionIndependentCode tier=10 seed=$seed result=$result")
}
