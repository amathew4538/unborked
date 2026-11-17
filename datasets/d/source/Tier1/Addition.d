import std.stdio;

int add(int a, int b) {
    return a + b;
}

void main() {
    writeln(add(0, 1));
    writeln(add(7, 13));
    writeln(add(65_536, 1000));
    writeln(add(64, 8));
    writeln(add(-42, -1));
}