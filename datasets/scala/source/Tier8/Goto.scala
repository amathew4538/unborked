@main def main(args: String*): Unit = {
  val seed = 18L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (18+((18%5)*7)) + seed + value
  println(s"feature=Goto tier=8 seed=$seed result=$result")
}
