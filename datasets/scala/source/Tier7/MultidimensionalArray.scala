@main def main(args: String*): Unit = {
  val seed = 85L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((85%16)*4) + seed + value
  println(s"feature=MultidimensionalArray tier=7 seed=$seed result=$result")
}
