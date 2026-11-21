import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (92*(92+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 92;
    writeln("feature=Devirtualization tier=14 seed=92 result=", feature(92, value));
}
