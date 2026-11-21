@main def main(args: String*): Unit = {
  val seed = 61L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (61+((61%5)*7)) + seed + value
  println(s"feature=NestedFunction tier=8 seed=$seed result=$result")
}
