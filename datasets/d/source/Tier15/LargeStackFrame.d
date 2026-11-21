import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((85%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 85;
    writeln("feature=LargeStackFrame tier=15 seed=85 result=", feature(85, value));
}
