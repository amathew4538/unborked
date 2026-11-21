import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 30+((30%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 30;
    writeln("feature=FunctionPointer tier=8 seed=30 result=", feature(30, value));
}
