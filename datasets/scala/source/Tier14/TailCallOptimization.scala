@main def main(args: String*): Unit = {
  val seed = 59L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((59*(59+1))/2) + seed + value
  println(s"feature=TailCallOptimization tier=14 seed=$seed result=$result")
}
