@main def main(args: String*): Unit = {
  val seed = 30L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (30+((30%5)*7)) + seed + value
  println(s"feature=Coroutine tier=8 seed=$seed result=$result")
}
