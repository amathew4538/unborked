import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (62%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 62;
    writeln("feature=Union tier=7 seed=62 result=", feature(62, value));
}
