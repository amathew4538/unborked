import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (95%11)+40;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 95;
    writeln("feature=TemplateSpecialization tier=9 seed=95 result=", feature(95, value));
}
