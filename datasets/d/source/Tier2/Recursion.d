import std.stdio;
int factorial(int n) { return n <= 1 ? 1 : n * factorial(n - 1); }
void main() { writeln(factorial(5)); }
