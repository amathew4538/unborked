@main def main(args: String*): Unit = {
  val seed = 89L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(89%8)) + seed + value
  println(s"feature=Promise tier=11 seed=$seed result=$result")
}
