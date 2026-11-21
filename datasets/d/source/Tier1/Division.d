import std.stdio;

int divide(int a, int b)
{
    return a / b;
}

void main()
{
    writeln(divide(0, 1));
    writeln(divide(7, 13));
    writeln(divide(65_536, 1000));
    writeln(divide(64, 8));
    writeln(divide(-42, -1));
}
