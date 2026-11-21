@main def main(args: String*): Unit = {
  val seed = 59L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((59%11)+40) + seed + value
  println(s"feature=AbstractClass tier=9 seed=$seed result=$result")
}
