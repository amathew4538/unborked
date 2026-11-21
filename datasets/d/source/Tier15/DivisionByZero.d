import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((92%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 92;
    writeln("feature=DivisionByZero tier=15 seed=92 result=", feature(92, value));
}
