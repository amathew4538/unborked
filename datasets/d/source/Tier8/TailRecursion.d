import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 63+((63%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 63;
    writeln("feature=TailRecursion tier=8 seed=63 result=", feature(63, value));
}
