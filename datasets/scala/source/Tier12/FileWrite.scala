@main def main(args: String*): Unit = {
  val seed = 43L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (43%1024) + seed + value
  println(s"feature=FileWrite tier=12 seed=$seed result=$result")
}
