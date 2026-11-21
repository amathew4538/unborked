@main def main(args: String*): Unit = {
  val seed = 52L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(52%8)) + seed + value
  println(s"feature=AtomicCompareExchange tier=11 seed=$seed result=$result")
}
