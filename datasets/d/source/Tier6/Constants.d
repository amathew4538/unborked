import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 27*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 27;
    writeln("feature=Constants tier=6 seed=27 result=", feature(27, value));
}
