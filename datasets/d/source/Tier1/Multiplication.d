import std.stdio;

int multiply(int a, int b) {
    return a * b;
}

void main() {
    writeln("%d\n", multiply(0, 1));
    writeln("%d\n", multiply(7, 13));
    writeln("%d\n", multiply(65_536, 1000));
    writeln("%d\n", multiply(64, 8));
    writeln("%d\n", multiply(-42, -1));
}