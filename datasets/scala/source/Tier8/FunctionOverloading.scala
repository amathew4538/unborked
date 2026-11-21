@main def main(args: String*): Unit = {
  val seed = 20L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (20+((20%5)*7)) + seed + value
  println(s"feature=FunctionOverloading tier=8 seed=$seed result=$result")
}
