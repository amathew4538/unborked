import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (61%64)*(61%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 61;
    writeln("feature=Trie tier=13 seed=61 result=", feature(61, value));
}
