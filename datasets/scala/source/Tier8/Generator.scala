@main def main(args: String*): Unit = {
  val seed = 35L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (35+((35%5)*7)) + seed + value
  println(s"feature=Generator tier=8 seed=$seed result=$result")
}
