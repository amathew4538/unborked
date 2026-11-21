@main def main(args: String*): Unit = {
  val seed = 35L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (100/((35%9)+1)) + seed + value
  println(s"feature=UnreachableCode tier=15 seed=$seed result=$result")
}
