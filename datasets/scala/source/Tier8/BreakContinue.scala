@main def main(args: String*): Unit = {
  val seed = 94L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (94+((94%5)*7)) + seed + value
  println(s"feature=BreakContinue tier=8 seed=$seed result=$result")
}
