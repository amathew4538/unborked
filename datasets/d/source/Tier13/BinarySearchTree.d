import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (74%64)*(74%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 74;
    writeln("feature=BinarySearchTree tier=13 seed=74 result=", feature(74, value));
}
