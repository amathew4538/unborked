@main def main(args: String*): Unit = {
  val seed = 60L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((60%16)*4) + seed + value
  println(s"feature=Slice tier=7 seed=$seed result=$result")
}
