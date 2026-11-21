@main def main(args: String*): Unit = {
  val seed = 16L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (16%1024) + seed + value
  println(s"feature=SocketUDP tier=12 seed=$seed result=$result")
}
