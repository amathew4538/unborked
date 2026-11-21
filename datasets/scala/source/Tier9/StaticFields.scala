@main def main(args: String*): Unit = {
  val seed = 34L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((34%11)+40) + seed + value
  println(s"feature=StaticFields tier=9 seed=$seed result=$result")
}
