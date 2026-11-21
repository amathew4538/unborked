@main def main(args: String*): Unit = {
  val seed = 3L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (3+((3%5)*7)) + seed + value
  println(s"feature=MultipleReturnValues tier=8 seed=$seed result=$result")
}
