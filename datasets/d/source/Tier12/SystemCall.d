import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 61%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 61;
    writeln("feature=SystemCall tier=12 seed=61 result=", feature(61, value));
}
