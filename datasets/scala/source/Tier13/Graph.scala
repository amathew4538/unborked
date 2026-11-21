@main def main(args: String*): Unit = {
  val seed = 6L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((6%64)*(6%64)) + seed + value
  println(s"feature=Graph tier=13 seed=$seed result=$result")
}
