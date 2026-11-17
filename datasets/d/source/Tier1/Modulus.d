import std.stdio;

int modulo(int a, int b) {
    return a % b;
}

void main() {
    writeln("%d\n", modulo(0, 1));
    writeln("%d\n", modulo(7, 13));
    writeln("%d\n", modulo(65_536, 1000));
    writeln("%d\n", modulo(64, 8));
    writeln("%d\n", modulo(-42, -1));
}