@main def main(args: String*): Unit = {
  val seed = 54L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (54%1024) + seed + value
  println(s"feature=MemoryMappedFiles tier=12 seed=$seed result=$result")
}
