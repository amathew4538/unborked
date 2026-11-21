import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (87%64)*(87%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 87;
    writeln("feature=UnionFind tier=13 seed=87 result=", feature(87, value));
}
