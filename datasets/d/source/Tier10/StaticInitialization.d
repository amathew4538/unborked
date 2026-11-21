import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 24+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 24;
    writeln("feature=StaticInitialization tier=10 seed=24 result=", feature(24, value));
}
