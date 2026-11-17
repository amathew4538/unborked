import std.stdio;
void main() { int[] values = [2,4,6,8,10]; int sum = 0; foreach (value; values) { writeln(value); sum += value; } writeln(sum); }
