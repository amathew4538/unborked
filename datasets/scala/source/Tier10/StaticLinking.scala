@main def main(args: String*): Unit = {
  val seed = 26L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (26+32) + seed + value
  println(s"feature=StaticLinking tier=10 seed=$seed result=$result")
}
