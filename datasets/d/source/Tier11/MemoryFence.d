import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(42%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 42;
    writeln("feature=MemoryFence tier=11 seed=42 result=", feature(42, value));
}
