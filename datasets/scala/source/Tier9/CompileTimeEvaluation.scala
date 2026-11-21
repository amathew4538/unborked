@main def main(args: String*): Unit = {
  val seed = 83L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((83%11)+40) + seed + value
  println(s"feature=CompileTimeEvaluation tier=9 seed=$seed result=$result")
}
