import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((67%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 67;
    writeln("feature=UninitializedMemory tier=15 seed=67 result=", feature(67, value));
}
