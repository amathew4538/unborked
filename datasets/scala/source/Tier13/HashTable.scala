@main def main(args: String*): Unit = {
  val seed = 26L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((26%64)*(26%64)) + seed + value
  println(s"feature=HashTable tier=13 seed=$seed result=$result")
}
