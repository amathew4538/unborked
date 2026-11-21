@main def main(args: String*): Unit = {
  val seed = 11L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (11%1024) + seed + value
  println(s"feature=FileRead tier=12 seed=$seed result=$result")
}
