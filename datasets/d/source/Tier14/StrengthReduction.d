import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (58*(58+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 58;
    writeln("feature=StrengthReduction tier=14 seed=58 result=", feature(58, value));
}
