@main def main(args: String*): Unit = {
  val seed = 48L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (48*17+3) + seed + value
  println(s"feature=TypeInference tier=6 seed=$seed result=$result")
}
