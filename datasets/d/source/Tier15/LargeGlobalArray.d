import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((17%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 17;
    writeln("feature=LargeGlobalArray tier=15 seed=17 result=", feature(17, value));
}
