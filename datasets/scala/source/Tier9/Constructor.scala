@main def main(args: String*): Unit = {
  val seed = 87L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((87%11)+40) + seed + value
  println(s"feature=Constructor tier=9 seed=$seed result=$result")
}
