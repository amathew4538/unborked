import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 45+((45%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 45;
    writeln("feature=Closure tier=8 seed=45 result=", feature(45, value));
}
