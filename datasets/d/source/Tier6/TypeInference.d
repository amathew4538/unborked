import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 48*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 48;
    writeln("feature=TypeInference tier=6 seed=48 result=", feature(48, value));
}
