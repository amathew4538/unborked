import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((60%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 60;
    writeln("feature=UninitializedVariable tier=15 seed=60 result=", feature(60, value));
}
