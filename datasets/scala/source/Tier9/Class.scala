@main def main(args: String*): Unit = {
  val seed = 57L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((57%11)+40) + seed + value
  println(s"feature=Class tier=9 seed=$seed result=$result")
}
