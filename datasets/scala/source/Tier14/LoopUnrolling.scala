@main def main(args: String*): Unit = {
  val seed = 16L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((16*(16+1))/2) + seed + value
  println(s"feature=LoopUnrolling tier=14 seed=$seed result=$result")
}
