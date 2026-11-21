import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (38%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 38;
    writeln("feature=Macros tier=9 seed=38 result=", feature(38, value));
}
