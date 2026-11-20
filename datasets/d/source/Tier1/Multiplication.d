import std.stdio;

int multiply(int a, int b) {
    return a * b;
}

void main() {
    writeln(multiply(0, 1));
    writeln(multiply(7, 13));
    writeln(multiply(65_536, 1000));
    writeln(multiply(64, 8));
    writeln(multiply(-42, -1));
}
