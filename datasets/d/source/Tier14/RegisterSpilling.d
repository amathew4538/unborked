import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (37*(37+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 37;
    writeln("feature=RegisterSpilling tier=14 seed=37 result=", feature(37, value));
}
