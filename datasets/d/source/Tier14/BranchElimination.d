import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = (5*(5+1))/2;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 5;
    writeln("feature=BranchElimination tier=14 seed=5 result=", feature(5, value));
}
