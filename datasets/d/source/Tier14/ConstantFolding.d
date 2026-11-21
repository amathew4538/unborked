import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (4*(4+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 4;
    writeln("feature=ConstantFolding tier=14 seed=4 result=", feature(4, value));
}
