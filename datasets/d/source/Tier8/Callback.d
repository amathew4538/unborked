import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 49+((49%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 49;
    writeln("feature=Callback tier=8 seed=49 result=", feature(49, value));
}
