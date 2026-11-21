import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 3+((3%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 3;
    writeln("feature=MultipleReturnValues tier=8 seed=3 result=", feature(3, value));
}
