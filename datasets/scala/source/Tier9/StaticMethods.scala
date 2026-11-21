@main def main(args: String*): Unit = {
  val seed = 30L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((30%11)+40) + seed + value
  println(s"feature=StaticMethods tier=9 seed=$seed result=$result")
}
