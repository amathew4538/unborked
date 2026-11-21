@main def main(args: String*): Unit = {
  val seed = 68L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((68%16)*4) + seed + value
  println(s"feature=References tier=7 seed=$seed result=$result")
}
