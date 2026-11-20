import std.file;
import std.stdio;

void main() {
    std.file.write("unborked_tier3.txt", "Hello, Dataset!");
    writeln("filesystem: ", readText("unborked_tier3.txt"));
    std.file.remove("unborked_tier3.txt");
}
