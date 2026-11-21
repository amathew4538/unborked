import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((68%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 68;
    writeln("feature=DoubleFree tier=15 seed=68 result=", feature(68, value));
}
