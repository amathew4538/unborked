import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 34+((34%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 34;
    writeln("feature=Lambda tier=8 seed=34 result=", feature(34, value));
}
