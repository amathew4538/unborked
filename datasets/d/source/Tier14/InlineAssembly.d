import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (28*(28+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 28;
    writeln("feature=InlineAssembly tier=14 seed=28 result=", feature(28, value));
}
