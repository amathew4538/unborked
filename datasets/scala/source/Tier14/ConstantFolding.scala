@main def main(args: String*): Unit = {
  val seed = 4L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((4*(4+1))/2) + seed + value
  println(s"feature=ConstantFolding tier=14 seed=$seed result=$result")
}
