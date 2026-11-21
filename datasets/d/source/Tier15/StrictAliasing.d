import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((35%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 35;
    writeln("feature=StrictAliasing tier=15 seed=35 result=", feature(35, value));
}
