@main def main(args: String*): Unit = {
  val seed = 91L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (91+32) + seed + value
  println(s"feature=DynamicLinking tier=10 seed=$seed result=$result")
}
