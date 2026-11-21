import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 76+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 76;
    writeln("feature=ReturnValueConvention tier=10 seed=76 result=", feature(76, value));
}
