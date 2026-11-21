@main def main(args: String*): Unit = {
  val seed = 77L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((77%11)+40) + seed + value
  println(s"feature=ExtensionMethods tier=9 seed=$seed result=$result")
}
