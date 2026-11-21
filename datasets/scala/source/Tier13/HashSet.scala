@main def main(args: String*): Unit = {
  val seed = 47L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((47%64)*(47%64)) + seed + value
  println(s"feature=HashSet tier=13 seed=$seed result=$result")
}
