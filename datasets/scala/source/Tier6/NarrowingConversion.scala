@main def main(args: String*): Unit = {
  val seed = 93L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (93*17+3) + seed + value
  println(s"feature=NarrowingConversion tier=6 seed=$seed result=$result")
}
