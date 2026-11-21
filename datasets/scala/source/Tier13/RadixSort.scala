@main def main(args: String*): Unit = {
  val seed = 74L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((74%64)*(74%64)) + seed + value
  println(s"feature=RadixSort tier=13 seed=$seed result=$result")
}
