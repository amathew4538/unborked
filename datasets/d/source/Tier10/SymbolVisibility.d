import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 15+32;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 15;
    writeln("feature=SymbolVisibility tier=10 seed=15 result=", feature(15, value));
}
