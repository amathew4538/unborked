@main def main(args: String*): Unit = {
  val seed = 34L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(34%8)) + seed + value
  println(s"feature=Spinlock tier=11 seed=$seed result=$result")
}
