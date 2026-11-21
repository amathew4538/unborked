@main def main(args: String*): Unit = {
  val seed = 93L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((93%11)+40) + seed + value
  println(s"feature=ObjectConstruction tier=9 seed=$seed result=$result")
}
