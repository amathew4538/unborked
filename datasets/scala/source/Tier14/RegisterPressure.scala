@main def main(args: String*): Unit = {
  val seed = 66L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((66*(66+1))/2) + seed + value
  println(s"feature=RegisterPressure tier=14 seed=$seed result=$result")
}
