import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (81*(81+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 81;
    writeln("feature=SimdIntrinsics tier=14 seed=81 result=", feature(81, value));
}
