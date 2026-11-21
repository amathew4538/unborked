import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 11%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 11;
    writeln("feature=ProcessExit tier=12 seed=11 result=", feature(11, value));
}
