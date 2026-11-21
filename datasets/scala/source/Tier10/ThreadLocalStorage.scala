@main def main(args: String*): Unit = {
  val seed = 21L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (21+32) + seed + value
  println(s"feature=ThreadLocalStorage tier=10 seed=$seed result=$result")
}
