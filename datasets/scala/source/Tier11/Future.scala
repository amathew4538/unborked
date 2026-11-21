@main def main(args: String*): Unit = {
  val seed = 65L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(65%8)) + seed + value
  println(s"feature=Future tier=11 seed=$seed result=$result")
}
