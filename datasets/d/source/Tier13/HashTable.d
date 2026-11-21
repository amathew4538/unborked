import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (26%64)*(26%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 26;
    writeln("feature=HashTable tier=13 seed=26 result=", feature(26, value));
}
