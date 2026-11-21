import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 35+((35%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 35;
    writeln("feature=Generator tier=8 seed=35 result=", feature(35, value));
}
