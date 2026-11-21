@main def main(args: String*): Unit = {
  val seed = 68L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (100/((68%9)+1)) + seed + value
  println(s"feature=DoubleFree tier=15 seed=$seed result=$result")
}
