@main def main(args: String*): Unit = {
  val seed = 5L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((5*(5+1))/2) + seed + value
  println(s"feature=BranchElimination tier=14 seed=$seed result=$result")
}
