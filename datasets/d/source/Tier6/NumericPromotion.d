import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 96*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 96;
    writeln("feature=NumericPromotion tier=6 seed=96 result=", feature(96, value));
}
