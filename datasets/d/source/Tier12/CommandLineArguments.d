import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 46%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 46;
    writeln("feature=CommandLineArguments tier=12 seed=46 result=", feature(46, value));
}
