import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (82%64)*(82%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 82;
    writeln("feature=Stack tier=13 seed=82 result=", feature(82, value));
}
