import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (75*(75+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 75;
    writeln("feature=ConstantPropagation tier=14 seed=75 result=", feature(75, value));
}
