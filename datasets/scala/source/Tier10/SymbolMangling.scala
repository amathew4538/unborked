@main def main(args: String*): Unit = {
  val seed = 38L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (38+32) + seed + value
  println(s"feature=SymbolMangling tier=10 seed=$seed result=$result")
}
