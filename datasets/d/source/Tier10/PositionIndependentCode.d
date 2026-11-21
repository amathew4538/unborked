import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 88+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 88;
    writeln("feature=PositionIndependentCode tier=10 seed=88 result=", feature(88, value));
}
