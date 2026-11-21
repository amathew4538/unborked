@main def main(args: String*): Unit = {
  val seed = 16L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((16%64)*(16%64)) + seed + value
  println(s"feature=MergeSort tier=13 seed=$seed result=$result")
}
