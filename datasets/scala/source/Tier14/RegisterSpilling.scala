@main def main(args: String*): Unit = {
  val seed = 37L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((37*(37+1))/2) + seed + value
  println(s"feature=RegisterSpilling tier=14 seed=$seed result=$result")
}
