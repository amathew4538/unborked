@main def main(args: String*): Unit = {
  val seed = 70L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (70*17+3) + seed + value
  println(s"feature=Comparison tier=6 seed=$seed result=$result")
}
