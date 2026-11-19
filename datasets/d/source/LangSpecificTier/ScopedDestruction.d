import std.stdio;
struct Report{~this(){writeln("report destroyed");}}
void main(){Report report;writeln("report written");}
