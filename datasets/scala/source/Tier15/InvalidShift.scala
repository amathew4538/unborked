@main def main(args: String*): Unit = {
  val seed = 18L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (100/((18%9)+1)) + seed + value
  println(s"feature=InvalidShift tier=15 seed=$seed result=$result")
}
