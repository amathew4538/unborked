@main def main(args: String*): Unit = {
  val seed = 46L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(46%8)) + seed + value
  println(s"feature=AtomicLoad tier=11 seed=$seed result=$result")
}
