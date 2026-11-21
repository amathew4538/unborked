@main def main(args: String*): Unit = {
  val seed = 86L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((86%64)*(86%64)) + seed + value
  println(s"feature=Dijkstra tier=13 seed=$seed result=$result")
}
