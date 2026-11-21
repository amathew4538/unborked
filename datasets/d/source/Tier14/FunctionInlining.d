import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (41*(41+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 41;
    writeln("feature=FunctionInlining tier=14 seed=41 result=", feature(41, value));
}
