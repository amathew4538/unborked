@main def main(args: String*): Unit = {
  val seed = 0L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((0%11)+40) + seed + value
  println(s"feature=Destructor tier=9 seed=$seed result=$result")
}
