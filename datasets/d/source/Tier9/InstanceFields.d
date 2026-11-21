import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (75%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 75;
    writeln("feature=InstanceFields tier=9 seed=75 result=", feature(75, value));
}
