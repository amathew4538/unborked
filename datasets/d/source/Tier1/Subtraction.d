import std.stdio;

int subtract(int a, int b) {
    return a - b;
}

void main() {
    writeln(subtract(0, 1));
    writeln(subtract(7, 13));
    writeln(subtract(65_536, 1000));
    writeln(subtract(64, 8));
    writeln(subtract(-42, -1));
}