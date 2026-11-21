@main def main(args: String*): Unit = {
  val seed = 9L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (9*17+3) + seed + value
  println(s"feature=SignedUnsigned tier=6 seed=$seed result=$result")
}
