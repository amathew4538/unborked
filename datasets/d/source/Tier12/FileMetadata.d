import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 40%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 40;
    writeln("feature=FileMetadata tier=12 seed=40 result=", feature(40, value));
}
