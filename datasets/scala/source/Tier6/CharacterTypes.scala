@main def main(args: String*): Unit = {
  val seed = 30L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (30*17+3) + seed + value
  println(s"feature=CharacterTypes tier=6 seed=$seed result=$result")
}
