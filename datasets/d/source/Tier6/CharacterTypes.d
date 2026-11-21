import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 30*17+3;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 30;
    writeln("feature=CharacterTypes tier=6 seed=30 result=", feature(30, value));
}
