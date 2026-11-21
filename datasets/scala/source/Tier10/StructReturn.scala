@main def main(args: String*): Unit = {
  val seed = 47L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (47+32) + seed + value
  println(s"feature=StructReturn tier=10 seed=$seed result=$result")
}
