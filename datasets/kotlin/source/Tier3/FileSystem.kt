package datasets.kotlin.source.Tier3

fun main() {
    val path = java.nio.file.Path.of("unborked_tier3.txt")
    java.nio.file.Files.writeString(path, "Hello, Dataset!")
    val content = java.nio.file.Files.readString(path)
    java.nio.file.Files.delete(path)
    println("filesystem: $content")
}
