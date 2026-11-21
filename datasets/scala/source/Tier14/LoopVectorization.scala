@main def main(args: String*): Unit = {
  val seed = 13L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((13*(13+1))/2) + seed + value
  println(s"feature=LoopVectorization tier=14 seed=$seed result=$result")
}
