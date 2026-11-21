@main def main(args: String*): Unit = {
  val text = args.headOption.getOrElse("8080")
  val port = text.toIntOption
  println(s"CInterop JNI-signature text=$text port=${port.getOrElse(-1)} valid=${port.exists(v => v >= 1 && v <= 65535)}")
}
