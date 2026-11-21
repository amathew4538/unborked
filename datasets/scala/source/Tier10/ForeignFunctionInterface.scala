@main def main(args: String*): Unit = {
  val seed = 73L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (73+32) + seed + value
  println(s"feature=ForeignFunctionInterface tier=10 seed=$seed result=$result")
}
