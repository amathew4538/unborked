import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (52%64)*(52%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 52;
    writeln("feature=Compression tier=13 seed=52 result=", feature(52, value));
}
