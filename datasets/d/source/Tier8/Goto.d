import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 18+((18%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 18;
    writeln("feature=Goto tier=8 seed=18 result=", feature(18, value));
}
