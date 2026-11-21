@main def main(args: String*): Unit = {
  val seed = 86L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (86+32) + seed + value
  println(s"feature=StackArguments tier=10 seed=$seed result=$result")
}
