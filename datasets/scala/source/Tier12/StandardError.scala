@main def main(args: String*): Unit = {
  val seed = 49L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (49%1024) + seed + value
  println(s"feature=StandardError tier=12 seed=$seed result=$result")
}
