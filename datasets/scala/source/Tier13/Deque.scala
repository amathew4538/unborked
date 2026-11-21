@main def main(args: String*): Unit = {
  val seed = 30L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((30%64)*(30%64)) + seed + value
  println(s"feature=Deque tier=13 seed=$seed result=$result")
}
