import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 29+((29%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 29;
    writeln("feature=Exception tier=8 seed=29 result=", feature(29, value));
}
