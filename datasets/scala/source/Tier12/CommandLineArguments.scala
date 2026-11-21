@main def main(args: String*): Unit = {
  val seed = 46L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (46%1024) + seed + value
  println(s"feature=CommandLineArguments tier=12 seed=$seed result=$result")
}
