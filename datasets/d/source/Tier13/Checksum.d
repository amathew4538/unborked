import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (10%64)*(10%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 10;
    writeln("feature=Checksum tier=13 seed=10 result=", feature(10, value));
}
