import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 59*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 59;
    writeln("feature=WideningConversion tier=6 seed=59 result=", feature(59, value));
}
