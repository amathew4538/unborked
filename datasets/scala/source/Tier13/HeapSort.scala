@main def main(args: String*): Unit = {
  val seed = 37L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((37%64)*(37%64)) + seed + value
  println(s"feature=HeapSort tier=13 seed=$seed result=$result")
}
