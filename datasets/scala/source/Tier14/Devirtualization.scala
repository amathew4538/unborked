@main def main(args: String*): Unit = {
  val seed = 92L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((92*(92+1))/2) + seed + value
  println(s"feature=Devirtualization tier=14 seed=$seed result=$result")
}
