import std.stdio;

int divide(int a, int b) {
    return a / b;
}

void main() {
    writeln("%d\n", divide(0, 1));
    writeln("%d\n", divide(7, 13));
    writeln("%d\n", divide(65_536, 1000));
    writeln("%d\n", divide(64, 8));
    writeln("%d\n", divide(-42, -1));
}