import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 43%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 43;
    writeln("feature=FileWrite tier=12 seed=43 result=", feature(43, value));
}
