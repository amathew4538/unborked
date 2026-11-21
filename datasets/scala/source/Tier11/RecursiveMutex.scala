@main def main(args: String*): Unit = {
  val seed = 87L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(87%8)) + seed + value
  println(s"feature=RecursiveMutex tier=11 seed=$seed result=$result")
}
