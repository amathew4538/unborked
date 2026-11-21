import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(87%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 87;
    writeln("feature=RecursiveMutex tier=11 seed=87 result=", feature(87, value));
}
