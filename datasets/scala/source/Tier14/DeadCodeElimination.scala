@main def main(args: String*): Unit = {
  val seed = 32L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((32*(32+1))/2) + seed + value
  println(s"feature=DeadCodeElimination tier=14 seed=$seed result=$result")
}
