import std.conv : to;
import std.stdio : writeln;

long feature(long seed, long value) {
    long result = 1%1024;
    return result + seed + value;
}
void main(string[] args) {
    long value = args.length > 1 ? args[1].to!long : 1;
    writeln("feature=SocketTCP tier=12 seed=1 result=", feature(1, value));
}
