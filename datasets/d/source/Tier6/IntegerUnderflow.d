import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 67*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 67;
    writeln("feature=IntegerUnderflow tier=6 seed=67 result=", feature(67, value));
}
