import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (16%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 16;
    writeln("feature=MemoryAliasing tier=7 seed=16 result=", feature(16, value));
}
