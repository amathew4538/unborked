import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (8%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 8;
    writeln("feature=VolatileAccess tier=7 seed=8 result=", feature(8, value));
}
