@main def main(args: String*): Unit = {
  val seed = 24L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (24%1024) + seed + value
  println(s"feature=StandardInput tier=12 seed=$seed result=$result")
}
