import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((23%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 23;
    writeln("feature=IntegerBoundaryValues tier=15 seed=23 result=", feature(23, value));
}
