@main def main(args: String*): Unit = {
  val seed = 38L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (38%1024) + seed + value
  println(s"feature=BinaryIO tier=12 seed=$seed result=$result")
}
