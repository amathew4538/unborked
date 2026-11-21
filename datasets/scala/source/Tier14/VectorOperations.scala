@main def main(args: String*): Unit = {
  val seed = 7L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((7*(7+1))/2) + seed + value
  println(s"feature=VectorOperations tier=14 seed=$seed result=$result")
}
