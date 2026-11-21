import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(49%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 49;
    writeln("feature=MemoryOrdering tier=11 seed=49 result=", feature(49, value));
}
