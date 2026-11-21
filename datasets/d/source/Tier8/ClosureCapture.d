import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 2+((2%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 2;
    writeln("feature=ClosureCapture tier=8 seed=2 result=", feature(2, value));
}
