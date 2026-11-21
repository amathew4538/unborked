@main def main(args: String*): Unit = {
  val seed = 60L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (60%1024) + seed + value
  println(s"feature=Pipe tier=12 seed=$seed result=$result")
}
