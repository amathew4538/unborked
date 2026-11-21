@main def main(args: String*): Unit = {
  val seed = 25L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((25%16)*4) + seed + value
  println(s"feature=MemoryMove tier=7 seed=$seed result=$result")
}
