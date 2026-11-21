@main def main(args: String*): Unit = {
  val seed = 91L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (91+((91%5)*7)) + seed + value
  println(s"feature=EarlyReturn tier=8 seed=$seed result=$result")
}
