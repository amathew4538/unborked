@main def main(args: String*): Unit = {
  val seed = 2L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (2+((2%5)*7)) + seed + value
  println(s"feature=ClosureCapture tier=8 seed=$seed result=$result")
}
