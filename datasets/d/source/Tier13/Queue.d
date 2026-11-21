import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (39%64)*(39%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 39;
    writeln("feature=Queue tier=13 seed=39 result=", feature(39, value));
}
