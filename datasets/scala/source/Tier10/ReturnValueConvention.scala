@main def main(args: String*): Unit = {
  val seed = 76L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (76+32) + seed + value
  println(s"feature=ReturnValueConvention tier=10 seed=$seed result=$result")
}
