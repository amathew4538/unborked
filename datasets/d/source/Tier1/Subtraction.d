import std.stdio;

int subtract(int a, int b) {
    return a - b;
}

void main() {
    writeln("%d\n", subtract(0, 1));
    writeln("%d\n", subtract(7, 13));
    writeln("%d\n", subtract(65_536, 1000));
    writeln("%d\n", subtract(64, 8));
    writeln("%d\n", subtract(-42, -1));
}