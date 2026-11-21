import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (0%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 0;
    writeln("feature=MultipleInheritance tier=9 seed=0 result=", feature(0, value));
}
