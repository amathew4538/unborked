@main def main(args: String*): Unit = {
  val seed = 1L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1%1024) + seed + value
  println(s"feature=SocketTCP tier=12 seed=$seed result=$result")
}
