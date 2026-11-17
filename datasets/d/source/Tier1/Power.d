import std.stdio;

int power(int a, int b) {
    return a ^^ b;
}

void main() {
    writeln("%d\n", power(0, 1));
    writeln("%d\n", power(7, 13));
    writeln("%d\n", power(65_536, 1000));
    writeln("%d\n", power(64, 8));
    writeln("%d\n", power(-42, -1));
}