import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(57%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 57;
    writeln("feature=AtomicStore tier=11 seed=57 result=", feature(57, value));
}
