@main def main(args: String*): Unit = {
  val seed = 48L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((48%11)+40) + seed + value
  println(s"feature=Interface tier=9 seed=$seed result=$result")
}
