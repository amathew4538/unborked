@main def main(args: String*): Unit = {
  val seed = 83L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((83%64)*(83%64)) + seed + value
  println(s"feature=BinaryTree tier=13 seed=$seed result=$result")
}
