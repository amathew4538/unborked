@main def main(args: String*): Unit = {
  val seed = 44L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (44+((44%5)*7)) + seed + value
  println(s"feature=ErrorPropagation tier=8 seed=$seed result=$result")
}
