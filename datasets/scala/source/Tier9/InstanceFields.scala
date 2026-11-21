@main def main(args: String*): Unit = {
  val seed = 75L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((75%11)+40) + seed + value
  println(s"feature=InstanceFields tier=9 seed=$seed result=$result")
}
