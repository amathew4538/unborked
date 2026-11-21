import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 21*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 21;
    writeln("feature=IntegerWidths tier=6 seed=21 result=", feature(21, value));
}
