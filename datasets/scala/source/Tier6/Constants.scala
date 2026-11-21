@main def main(args: String*): Unit = {
  val seed = 27L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (27*17+3) + seed + value
  println(s"feature=Constants tier=6 seed=$seed result=$result")
}
