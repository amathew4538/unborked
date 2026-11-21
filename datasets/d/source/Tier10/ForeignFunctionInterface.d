import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 73+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 73;
    writeln("feature=ForeignFunctionInterface tier=10 seed=73 result=", feature(73, value));
}
