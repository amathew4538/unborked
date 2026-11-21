import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1+(75%8);
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 75;
    writeln("feature=ProducerConsumer tier=11 seed=75 result=", feature(75, value));
}
