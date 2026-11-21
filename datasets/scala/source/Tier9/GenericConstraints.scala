@main def main(args: String*): Unit = {
  val seed = 76L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((76%11)+40) + seed + value
  println(s"feature=GenericConstraints tier=9 seed=$seed result=$result")
}
