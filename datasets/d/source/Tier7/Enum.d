import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (9%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 9;
    writeln("feature=Enum tier=7 seed=9 result=", feature(9, value));
}
