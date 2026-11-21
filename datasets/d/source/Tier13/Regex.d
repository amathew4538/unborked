import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (45%64)*(45%64);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 45;
    writeln("feature=Regex tier=13 seed=45 result=", feature(45, value));
}
