@main def main(args: String*): Unit = {
  val seed = 72L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(72%8)) + seed + value
  println(s"feature=ConditionVariable tier=11 seed=$seed result=$result")
}
