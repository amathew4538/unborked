@main def main(args: String*): Unit = {
  val seed = 45L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((45%64)*(45%64)) + seed + value
  println(s"feature=Regex tier=13 seed=$seed result=$result")
}
