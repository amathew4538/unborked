import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(14%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 14;
    writeln("feature=Mutex tier=11 seed=14 result=", feature(14, value));
}
