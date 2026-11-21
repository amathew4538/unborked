import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((18%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 18;
    writeln("feature=InvalidShift tier=15 seed=18 result=", feature(18, value));
}
