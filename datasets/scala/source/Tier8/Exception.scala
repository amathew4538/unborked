@main def main(args: String*): Unit = {
  val seed = 29L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (29+((29%5)*7)) + seed + value
  println(s"feature=Exception tier=8 seed=$seed result=$result")
}
