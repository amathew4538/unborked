import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(34%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 34;
    writeln("feature=Spinlock tier=11 seed=34 result=", feature(34, value));
}
