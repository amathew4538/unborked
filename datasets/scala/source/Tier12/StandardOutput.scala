@main def main(args: String*): Unit = {
  val seed = 23L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (23%1024) + seed + value
  println(s"feature=StandardOutput tier=12 seed=$seed result=$result")
}
