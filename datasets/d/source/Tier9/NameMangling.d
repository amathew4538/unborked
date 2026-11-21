import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (78%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 78;
    writeln("feature=NameMangling tier=9 seed=78 result=", feature(78, value));
}
