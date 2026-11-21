@main def main(args: String*): Unit = {
  val seed = 29L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(29%8)) + seed + value
  println(s"feature=Semaphore tier=11 seed=$seed result=$result")
}
