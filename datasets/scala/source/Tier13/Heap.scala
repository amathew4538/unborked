@main def main(args: String*): Unit = {
  val seed = 43L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((43%64)*(43%64)) + seed + value
  println(s"feature=Heap tier=13 seed=$seed result=$result")
}
