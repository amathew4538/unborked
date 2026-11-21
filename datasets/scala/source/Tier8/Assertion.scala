@main def main(args: String*): Unit = {
  val seed = 73L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (73+((73%5)*7)) + seed + value
  println(s"feature=Assertion tier=8 seed=$seed result=$result")
}
