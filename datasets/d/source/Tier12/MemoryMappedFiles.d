import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 54%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 54;
    writeln("feature=MemoryMappedFiles tier=12 seed=54 result=", feature(54, value));
}
