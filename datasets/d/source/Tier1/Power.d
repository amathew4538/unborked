import std.stdio;

int power(int a, int b) {
    return a ^^ b;
}

void main() {
    writeln(power(2, 8));
    writeln(power(3, 4));
}