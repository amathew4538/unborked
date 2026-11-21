import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (13*(13+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 13;
    writeln("feature=LoopVectorization tier=14 seed=13 result=", feature(13, value));
}
