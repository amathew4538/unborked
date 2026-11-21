@main def main(args: String*): Unit = {
  val seed = 73L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((73%16)*4) + seed + value
  println(s"feature=PassByValue tier=7 seed=$seed result=$result")
}
