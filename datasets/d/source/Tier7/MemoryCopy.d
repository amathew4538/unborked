import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (4%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 4;
    writeln("feature=MemoryCopy tier=7 seed=4 result=", feature(4, value));
}
