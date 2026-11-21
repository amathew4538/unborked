@main def main(args: String*): Unit = {
  val seed = 45L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((45%16)*4) + seed + value
  println(s"feature=PackedStruct tier=7 seed=$seed result=$result")
}
