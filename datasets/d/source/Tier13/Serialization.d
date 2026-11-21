import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (44%64)*(44%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 44;
    writeln("feature=Serialization tier=13 seed=44 result=", feature(44, value));
}
