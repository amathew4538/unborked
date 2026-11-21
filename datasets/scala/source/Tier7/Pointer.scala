@main def main(args: String*): Unit = {
  val seed = 34L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((34%16)*4) + seed + value
  println(s"feature=Pointer tier=7 seed=$seed result=$result")
}
