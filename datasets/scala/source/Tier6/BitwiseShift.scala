@main def main(args: String*): Unit = {
  val seed = 38L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (38*17+3) + seed + value
  println(s"feature=BitwiseShift tier=6 seed=$seed result=$result")
}
