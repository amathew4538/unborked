import std.stdio;

int modulo(int a, int b)
{
    return a % b;
}

void main()
{
    writeln(modulo(0, 1));
    writeln(modulo(7, 13));
    writeln(modulo(65_536, 1000));
    writeln(modulo(64, 8));
    writeln(modulo(-42, -1));
}
