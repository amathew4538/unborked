import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 86+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 86;
    writeln("feature=CInterop tier=10 seed=86 result=", feature(86, value));
}
