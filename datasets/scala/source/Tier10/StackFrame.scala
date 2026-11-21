@main def main(args: String*): Unit = {
  val seed = 90L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (90+32) + seed + value
  println(s"feature=StackFrame tier=10 seed=$seed result=$result")
}
