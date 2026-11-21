@main def main(args: String*): Unit = {
  val seed = 75L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((75*(75+1))/2) + seed + value
  println(s"feature=ConstantPropagation tier=14 seed=$seed result=$result")
}
