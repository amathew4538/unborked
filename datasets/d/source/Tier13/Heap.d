import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (43%64)*(43%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 43;
    writeln("feature=Heap tier=13 seed=43 result=", feature(43, value));
}
