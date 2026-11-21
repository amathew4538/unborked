import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 93*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 93;
    writeln("feature=NarrowingConversion tier=6 seed=93 result=", feature(93, value));
}
