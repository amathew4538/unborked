import core.stdc.stdlib : strtol;
import std.stdio : writeln;
import std.string : toStringz;
void main(string[] args) {
    auto text = args.length > 1 ? args[1] : "8080";
    char* end = null;
    long port = strtol(toStringz(text), &end, 10);
    writeln("CInterop extern(C)=strtol port=", port, " valid=", port >= 1 && port <= 65535);
}
