@main def main(args: String*): Unit = {
  val seed = 34L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (34+((34%5)*7)) + seed + value
  println(s"feature=Lambda tier=8 seed=$seed result=$result")
}
