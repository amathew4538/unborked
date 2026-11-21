@main def main(args: String*): Unit = {
  val seed = 0L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (0%1024) + seed + value
  println(s"feature=NetworkServer tier=12 seed=$seed result=$result")
}
