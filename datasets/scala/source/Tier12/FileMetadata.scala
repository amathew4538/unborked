@main def main(args: String*): Unit = {
  val seed = 40L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (40%1024) + seed + value
  println(s"feature=FileMetadata tier=12 seed=$seed result=$result")
}
