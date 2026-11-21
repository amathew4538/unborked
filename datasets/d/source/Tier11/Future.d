import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(65%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 65;
    writeln("feature=Future tier=11 seed=65 result=", feature(65, value));
}
