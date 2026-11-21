@main def main(args: String*): Unit = {
  val seed = 28L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((28*(28+1))/2) + seed + value
  println(s"feature=InlineAssembly tier=14 seed=$seed result=$result")
}
