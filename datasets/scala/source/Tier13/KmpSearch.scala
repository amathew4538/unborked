@main def main(args: String*): Unit = {
  val seed = 15L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((15%64)*(15%64)) + seed + value
  println(s"feature=KmpSearch tier=13 seed=$seed result=$result")
}
