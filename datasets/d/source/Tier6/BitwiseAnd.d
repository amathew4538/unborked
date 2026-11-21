import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 3*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 3;
    writeln("feature=BitwiseAnd tier=6 seed=3 result=", feature(3, value));
}
