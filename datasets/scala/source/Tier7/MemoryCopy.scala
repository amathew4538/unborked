@main def main(args: String*): Unit = {
  val seed = 4L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((4%16)*4) + seed + value
  println(s"feature=MemoryCopy tier=7 seed=$seed result=$result")
}
