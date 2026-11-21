import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (7*(7+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 7;
    writeln("feature=VectorOperations tier=14 seed=7 result=", feature(7, value));
}
