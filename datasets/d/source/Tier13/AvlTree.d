import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (31%64)*(31%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 31;
    writeln("feature=AvlTree tier=13 seed=31 result=", feature(31, value));
}
