import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (15%64)*(15%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 15;
    writeln("feature=KmpSearch tier=13 seed=15 result=", feature(15, value));
}
