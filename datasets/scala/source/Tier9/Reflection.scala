@main def main(args: String*): Unit = {
  val seed = 52L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((52%11)+40) + seed + value
  println(s"feature=Reflection tier=9 seed=$seed result=$result")
}
