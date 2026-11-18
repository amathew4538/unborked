import std.stdio;

void main() {
    int sum = 0;
    foreach (i; 1 .. 6) sum += i;
    writeln(sum);
}
