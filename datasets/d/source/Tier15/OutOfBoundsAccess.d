import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((94%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 94;
    writeln("feature=OutOfBoundsAccess tier=15 seed=94 result=", feature(94, value));
}
