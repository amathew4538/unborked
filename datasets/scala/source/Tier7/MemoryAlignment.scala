@main def main(args: String*): Unit = {
  val seed = 44L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((44%16)*4) + seed + value
  println(s"feature=MemoryAlignment tier=7 seed=$seed result=$result")
}
