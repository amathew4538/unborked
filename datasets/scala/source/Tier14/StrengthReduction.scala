@main def main(args: String*): Unit = {
  val seed = 58L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((58*(58+1))/2) + seed + value
  println(s"feature=StrengthReduction tier=14 seed=$seed result=$result")
}
