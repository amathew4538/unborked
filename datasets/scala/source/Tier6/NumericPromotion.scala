@main def main(args: String*): Unit = {
  val seed = 96L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (96*17+3) + seed + value
  println(s"feature=NumericPromotion tier=6 seed=$seed result=$result")
}
