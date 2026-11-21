@main def main(args: String*): Unit = {
  val seed = 45L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(45%8)) + seed + value
  println(s"feature=ParallelReduction tier=11 seed=$seed result=$result")
}
