@main def main(args: String*): Unit = {
  val seed = 39L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (39+32) + seed + value
  println(s"feature=SharedLibrary tier=10 seed=$seed result=$result")
}
