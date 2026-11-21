@main def main(args: String*): Unit = {
  val seed = 3L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (3*17+3) + seed + value
  println(s"feature=BitwiseAnd tier=6 seed=$seed result=$result")
}
