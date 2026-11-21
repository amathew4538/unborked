@main def main(args: String*): Unit = {
  val seed = 50L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((50%16)*4) + seed + value
  println(s"feature=DynamicArray tier=7 seed=$seed result=$result")
}
