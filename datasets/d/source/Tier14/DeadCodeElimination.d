import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (32*(32+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 32;
    writeln("feature=DeadCodeElimination tier=14 seed=32 result=", feature(32, value));
}
