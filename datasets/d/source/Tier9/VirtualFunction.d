import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (81%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 81;
    writeln("feature=VirtualFunction tier=9 seed=81 result=", feature(81, value));
}
