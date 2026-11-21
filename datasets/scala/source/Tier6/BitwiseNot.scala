@main def main(args: String*): Unit = {
  val seed = 82L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (82*17+3) + seed + value
  println(s"feature=BitwiseNot tier=6 seed=$seed result=$result")
}
