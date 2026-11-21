@main def main(args: String*): Unit = {
  val seed = 57L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((57%16)*4) + seed + value
  println(s"feature=AllocationReallocationFree tier=7 seed=$seed result=$result")
}
