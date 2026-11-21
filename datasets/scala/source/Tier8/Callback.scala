@main def main(args: String*): Unit = {
  val seed = 49L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (49+((49%5)*7)) + seed + value
  println(s"feature=Callback tier=8 seed=$seed result=$result")
}
