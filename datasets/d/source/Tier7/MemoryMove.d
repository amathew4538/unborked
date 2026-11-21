import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (25%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 25;
    writeln("feature=MemoryMove tier=7 seed=25 result=", feature(25, value));
}
