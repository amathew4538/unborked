@main def main(args: String*): Unit = {
  val seed = 31L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((31%64)*(31%64)) + seed + value
  println(s"feature=AvlTree tier=13 seed=$seed result=$result")
}
