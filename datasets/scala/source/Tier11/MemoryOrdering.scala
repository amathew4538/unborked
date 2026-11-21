@main def main(args: String*): Unit = {
  val seed = 49L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(49%8)) + seed + value
  println(s"feature=MemoryOrdering tier=11 seed=$seed result=$result")
}
