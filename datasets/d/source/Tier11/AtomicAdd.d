import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(72%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 72;
    writeln("feature=AtomicAdd tier=11 seed=72 result=", feature(72, value));
}
