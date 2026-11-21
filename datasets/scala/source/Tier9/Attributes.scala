@main def main(args: String*): Unit = {
  val seed = 6L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((6%11)+40) + seed + value
  println(s"feature=Attributes tier=9 seed=$seed result=$result")
}
