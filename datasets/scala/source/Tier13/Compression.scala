@main def main(args: String*): Unit = {
  val seed = 52L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((52%64)*(52%64)) + seed + value
  println(s"feature=Compression tier=13 seed=$seed result=$result")
}
