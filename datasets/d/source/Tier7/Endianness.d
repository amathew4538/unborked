import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (0%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 0;
    writeln("feature=Endianness tier=7 seed=0 result=", feature(0, value));
}
