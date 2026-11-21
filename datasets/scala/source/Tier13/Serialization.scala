@main def main(args: String*): Unit = {
  val seed = 44L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((44%64)*(44%64)) + seed + value
  println(s"feature=Serialization tier=13 seed=$seed result=$result")
}
