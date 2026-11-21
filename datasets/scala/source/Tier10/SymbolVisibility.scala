@main def main(args: String*): Unit = {
  val seed = 15L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (15+32) + seed + value
  println(s"feature=SymbolVisibility tier=10 seed=$seed result=$result")
}
