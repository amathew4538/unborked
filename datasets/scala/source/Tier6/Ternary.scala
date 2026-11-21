@main def main(args: String*): Unit = {
  val seed = 77L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (77*17+3) + seed + value
  println(s"feature=Ternary tier=6 seed=$seed result=$result")
}
