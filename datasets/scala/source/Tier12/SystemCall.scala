@main def main(args: String*): Unit = {
  val seed = 61L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (61%1024) + seed + value
  println(s"feature=SystemCall tier=12 seed=$seed result=$result")
}
