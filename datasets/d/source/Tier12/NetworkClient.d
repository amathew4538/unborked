import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 83%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 83;
    writeln("feature=NetworkClient tier=12 seed=83 result=", feature(83, value));
}
