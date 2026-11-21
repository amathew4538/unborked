import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (95%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 95;
    writeln("feature=ArrayLayout tier=7 seed=95 result=", feature(95, value));
}
