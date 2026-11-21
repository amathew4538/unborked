import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (16*(16+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 16;
    writeln("feature=LoopUnrolling tier=14 seed=16 result=", feature(16, value));
}
