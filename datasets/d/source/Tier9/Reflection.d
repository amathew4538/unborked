import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (52%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 52;
    writeln("feature=Reflection tier=9 seed=52 result=", feature(52, value));
}
