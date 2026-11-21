import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (47%64)*(47%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 47;
    writeln("feature=HashSet tier=13 seed=47 result=", feature(47, value));
}
