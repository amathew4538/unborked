import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 72%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 72;
    writeln("feature=DirectoryOperations tier=12 seed=72 result=", feature(72, value));
}
