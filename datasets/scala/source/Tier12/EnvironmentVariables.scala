@main def main(args: String*): Unit = {
  val seed = 52L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (52%1024) + seed + value
  println(s"feature=EnvironmentVariables tier=12 seed=$seed result=$result")
}
