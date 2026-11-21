@main def main(args: String*): Unit = {
  val seed = 28L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (28*17+3) + seed + value
  println(s"feature=ImplicitConversion tier=6 seed=$seed result=$result")
}
