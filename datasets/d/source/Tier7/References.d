import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (68%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 68;
    writeln("feature=References tier=7 seed=68 result=", feature(68, value));
}
