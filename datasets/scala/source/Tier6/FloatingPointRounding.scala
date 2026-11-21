@main def main(args: String*): Unit = {
  val seed = 87L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (87*17+3) + seed + value
  println(s"feature=FloatingPointRounding tier=6 seed=$seed result=$result")
}
