@main def main(args: String*): Unit = {
  val seed = 81L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((81*(81+1))/2) + seed + value
  println(s"feature=SimdIntrinsics tier=14 seed=$seed result=$result")
}
