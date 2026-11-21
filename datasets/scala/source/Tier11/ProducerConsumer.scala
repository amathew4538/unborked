@main def main(args: String*): Unit = {
  val seed = 75L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(75%8)) + seed + value
  println(s"feature=ProducerConsumer tier=11 seed=$seed result=$result")
}
