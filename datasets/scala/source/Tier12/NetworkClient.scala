@main def main(args: String*): Unit = {
  val seed = 83L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (83%1024) + seed + value
  println(s"feature=NetworkClient tier=12 seed=$seed result=$result")
}
