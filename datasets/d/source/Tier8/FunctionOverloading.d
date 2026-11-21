import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 20+((20%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 20;
    writeln("feature=FunctionOverloading tier=8 seed=20 result=", feature(20, value));
}
