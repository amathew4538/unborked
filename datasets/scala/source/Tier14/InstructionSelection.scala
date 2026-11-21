@main def main(args: String*): Unit = {
  val seed = 41L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((41*(41+1))/2) + seed + value
  println(s"feature=InstructionSelection tier=14 seed=$seed result=$result")
}
