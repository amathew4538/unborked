@main def main(args: String*): Unit = {
  val seed = 95L
  val value = args.headOption.flatMap(v => scala.util.Try(v.toLong).toOption).getOrElse(seed)
  val result = ((95%11)+40) + seed + value
  println(s"feature=TemplateSpecialization tier=9 seed=$seed result=$result")
}
