import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(52%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 52;
    writeln("feature=AtomicCompareExchange tier=11 seed=52 result=", feature(52, value));
}
