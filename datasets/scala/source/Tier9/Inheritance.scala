@main def main(args: String*): Unit = {
  val seed = 1L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((1%11)+40) + seed + value
  println(s"feature=Inheritance tier=9 seed=$seed result=$result")
}
