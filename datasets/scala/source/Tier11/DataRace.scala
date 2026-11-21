@main def main(args: String*): Unit = {
  val seed = 96L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (1+(96%8)) + seed + value
  println(s"feature=DataRace tier=11 seed=$seed result=$result")
}
