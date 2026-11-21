import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (38%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 38;
    writeln("feature=NestedStruct tier=7 seed=38 result=", feature(38, value));
}
