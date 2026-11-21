import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 77+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 77;
    writeln("feature=DynamicInitialization tier=10 seed=77 result=", feature(77, value));
}
