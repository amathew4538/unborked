@main def main(args: String*): Unit = {
  val seed = 47L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((47*(47+1))/2) + seed + value
  println(s"feature=BoundsCheckElimination tier=14 seed=$seed result=$result")
}
