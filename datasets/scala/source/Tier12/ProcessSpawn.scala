@main def main(args: String*): Unit = {
  val seed = 63L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (63%1024) + seed + value
  println(s"feature=ProcessSpawn tier=12 seed=$seed result=$result")
}
