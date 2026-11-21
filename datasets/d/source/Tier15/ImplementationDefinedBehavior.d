import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((7%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 7;
    writeln("feature=ImplementationDefinedBehavior tier=15 seed=7 result=", feature(7, value));
}
