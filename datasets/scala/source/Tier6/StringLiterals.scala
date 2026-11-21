@main def main(args: String*): Unit = {
  val seed = 45L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (45*17+3) + seed + value
  println(s"feature=StringLiterals tier=6 seed=$seed result=$result")
}
