import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 50+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 50;
    writeln("feature=PositionIndependentExecutable tier=10 seed=50 result=", feature(50, value));
}
