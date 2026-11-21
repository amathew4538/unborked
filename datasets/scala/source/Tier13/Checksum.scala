@main def main(args: String*): Unit = {
  val seed = 10L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((10%64)*(10%64)) + seed + value
  println(s"feature=Checksum tier=13 seed=$seed result=$result")
}
