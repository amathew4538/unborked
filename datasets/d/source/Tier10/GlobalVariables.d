import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 66+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 66;
    writeln("feature=GlobalVariables tier=10 seed=66 result=", feature(66, value));
}
