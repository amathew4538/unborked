import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 28*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 28;
    writeln("feature=ImplicitConversion tier=6 seed=28 result=", feature(28, value));
}
