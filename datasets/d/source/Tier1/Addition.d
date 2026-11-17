import std.stdio;

int add(int a, int b) {
    return a + b;
}

void main() {
    writeln("%d\n", add(0, 1));
    writeln("%d\n", add(7, 13));
    writeln("%d\n", add(65_536, 1000));
    writeln("%d\n", add(64, 8));
    writeln("%d\n", add(-42, -1));
}