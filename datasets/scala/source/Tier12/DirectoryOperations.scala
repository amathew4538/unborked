@main def main(args: String*): Unit = {
  val seed = 72L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (72%1024) + seed + value
  println(s"feature=DirectoryOperations tier=12 seed=$seed result=$result")
}
