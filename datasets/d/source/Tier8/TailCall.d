import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 70+((70%5)*7);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 70;
    writeln("feature=TailCall tier=8 seed=70 result=", feature(70, value));
}
