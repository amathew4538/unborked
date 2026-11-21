@main def main(args: String*): Unit = {
  val seed = 9L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((9%16)*4) + seed + value
  println(s"feature=Enum tier=7 seed=$seed result=$result")
}
