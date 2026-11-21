@main def main(args: String*): Unit = {
  val seed = 14L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(14%8)) + seed + value
  println(s"feature=ThreadCreate tier=11 seed=$seed result=$result")
}
