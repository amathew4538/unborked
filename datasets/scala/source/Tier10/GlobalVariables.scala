@main def main(args: String*): Unit = {
  val seed = 66L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (66+32) + seed + value
  println(s"feature=GlobalVariables tier=10 seed=$seed result=$result")
}
