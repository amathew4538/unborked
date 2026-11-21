@main def main(args: String*): Unit = {
  val seed = 64L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (64+((64%5)*7)) + seed + value
  println(s"feature=Labels tier=8 seed=$seed result=$result")
}
