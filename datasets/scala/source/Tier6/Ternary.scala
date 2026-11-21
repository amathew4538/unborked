@main def main(args: String*): Unit = {
  val value =
    args.headOption.flatMap(v => scala.util.Try(v.toInt).toOption).getOrElse(42)
  val result = value * value + 3
  println(s"feature=Ternary value=$value result=$result")
}
