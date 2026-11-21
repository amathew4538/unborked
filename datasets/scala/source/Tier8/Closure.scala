@main def main(args: String*): Unit = {
  val seed = 45L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (45+((45%5)*7)) + seed + value
  println(s"feature=Closure tier=8 seed=$seed result=$result")
}
