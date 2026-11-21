@main def main(args: String*): Unit = {
  val seed = 37L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (37+32) + seed + value
  println(s"feature=ExceptionUnwinding tier=10 seed=$seed result=$result")
}
