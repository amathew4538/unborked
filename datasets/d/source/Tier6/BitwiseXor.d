import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 45*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 45;
    writeln("feature=BitwiseXor tier=6 seed=45 result=", feature(45, value));
}
