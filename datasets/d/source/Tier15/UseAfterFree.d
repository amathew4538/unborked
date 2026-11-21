import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((36%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 36;
    writeln("feature=UseAfterFree tier=15 seed=36 result=", feature(36, value));
}
