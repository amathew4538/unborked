@main def main(args: String*): Unit = {
  val seed = 49L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((49%16)*4) + seed + value
  println(s"feature=HeapAllocation tier=7 seed=$seed result=$result")
}
