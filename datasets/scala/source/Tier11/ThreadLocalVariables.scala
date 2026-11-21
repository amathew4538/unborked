@main def main(args: String*): Unit = {
  val seed = 0L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(0%8)) + seed + value
  println(s"feature=ThreadLocalVariables tier=11 seed=$seed result=$result")
}
