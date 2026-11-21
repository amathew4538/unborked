import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 90+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 90;
    writeln("feature=StackFrame tier=10 seed=90 result=", feature(90, value));
}
