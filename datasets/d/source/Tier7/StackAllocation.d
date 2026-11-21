import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (51%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 51;
    writeln("feature=StackAllocation tier=7 seed=51 result=", feature(51, value));
}
