@main def main(args: String*): Unit = {
  val seed = 87L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((87%64)*(87%64)) + seed + value
  println(s"feature=UnionFind tier=13 seed=$seed result=$result")
}
