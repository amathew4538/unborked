@main def main(args: String*): Unit = {
  val seed = 70L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (70+((70%5)*7)) + seed + value
  println(s"feature=TailCall tier=8 seed=$seed result=$result")
}
