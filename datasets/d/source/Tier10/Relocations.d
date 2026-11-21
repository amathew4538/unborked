import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 64+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 64;
    writeln("feature=Relocations tier=10 seed=64 result=", feature(64, value));
}
