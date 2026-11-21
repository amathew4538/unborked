package datasets.kotlin.source.Tier10

// Kotlin/JVM exposes a native binding through JNI; this declaration maps the
// native parser contract without loading a platform-specific shared library.
external fun parseNativePort(text: String): Int

fun main(args: Array<String>) {
    val text = args.firstOrNull() ?: "8080"
    val port = text.toIntOrNull()
    println("CInterop JNI-signature text=$text port=${port ?: -1} valid=${port != null && port in 1..65535}")
}
