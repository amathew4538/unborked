import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(29%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 29;
    writeln("feature=Semaphore tier=11 seed=29 result=", feature(29, value));
}
