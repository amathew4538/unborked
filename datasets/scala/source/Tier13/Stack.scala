@main def main(args: String*): Unit = {
  val seed = 82L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((82%64)*(82%64)) + seed + value
  println(s"feature=Stack tier=13 seed=$seed result=$result")
}
