import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (84%16)*4;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 84;
    writeln("feature=MemoryPadding tier=7 seed=84 result=", feature(84, value));
}
