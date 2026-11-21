import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 100/((37%9)+1);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 37;
    writeln("feature=UndefinedBehavior tier=15 seed=37 result=", feature(37, value));
}
