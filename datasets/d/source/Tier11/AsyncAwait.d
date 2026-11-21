import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(71%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 71;
    writeln("feature=AsyncAwait tier=11 seed=71 result=", feature(71, value));
}
