@main def main(args: String*): Unit = {
  val seed = 39L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((39%64)*(39%64)) + seed + value
  println(s"feature=Queue tier=13 seed=$seed result=$result")
}
