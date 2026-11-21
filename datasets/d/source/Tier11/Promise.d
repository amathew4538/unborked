import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(89%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 89;
    writeln("feature=Promise tier=11 seed=89 result=", feature(89, value));
}
