@main def main(args: String*): Unit = {
  val seed = 77L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (77+32) + seed + value
  println(s"feature=DynamicInitialization tier=10 seed=$seed result=$result")
}
