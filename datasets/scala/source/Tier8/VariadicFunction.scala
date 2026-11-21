@main def main(args: String*): Unit = {
  val seed = 93L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (93+((93%5)*7)) + seed + value
  println(s"feature=VariadicFunction tier=8 seed=$seed result=$result")
}
