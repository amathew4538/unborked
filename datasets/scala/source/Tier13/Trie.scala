@main def main(args: String*): Unit = {
  val seed = 61L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((61%64)*(61%64)) + seed + value
  println(s"feature=Trie tier=13 seed=$seed result=$result")
}
