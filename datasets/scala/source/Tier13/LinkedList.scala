@main def main(args: String*): Unit = {
  val seed = 90L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((90%64)*(90%64)) + seed + value
  println(s"feature=LinkedList tier=13 seed=$seed result=$result")
}
