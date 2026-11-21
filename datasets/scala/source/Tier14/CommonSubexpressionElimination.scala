@main def main(args: String*): Unit = {
  val seed = 52L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((52*(52+1))/2) + seed + value
  println(s"feature=CommonSubexpressionElimination tier=14 seed=$seed result=$result")
}
