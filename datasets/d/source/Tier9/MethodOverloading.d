import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (6%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 6;
    writeln("feature=MethodOverloading tier=9 seed=6 result=", feature(6, value));
}
