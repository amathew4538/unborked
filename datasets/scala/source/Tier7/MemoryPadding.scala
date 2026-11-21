@main def main(args: String*): Unit = {
  val seed = 84L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((84%16)*4) + seed + value
  println(s"feature=MemoryPadding tier=7 seed=$seed result=$result")
}
