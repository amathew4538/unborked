@main def main(args: String*): Unit = {
  val seed = 81L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((81%11)+40) + seed + value
  println(s"feature=VirtualFunction tier=9 seed=$seed result=$result")
}
