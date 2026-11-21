@main def main(args: String*): Unit = {
  val seed = 4L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((4%64)*(4%64)) + seed + value
  println(s"feature=GraphBFS tier=13 seed=$seed result=$result")
}
