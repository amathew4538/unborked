@main def main(args: String*): Unit = {
  val seed = 20L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = (100/((20%9)+1)) + seed + value
  println(s"feature=VariableShadowing tier=15 seed=$seed result=$result")
}
