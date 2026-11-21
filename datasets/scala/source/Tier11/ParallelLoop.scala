@main def main(args: String*): Unit = {
  val seed = 71L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(71%8)) + seed + value
  println(s"feature=ParallelLoop tier=11 seed=$seed result=$result")
}
