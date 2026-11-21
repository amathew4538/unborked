import std.stdio;

int square(int value)
{
    return value * value;
}

enum compileValue = square(7);
void main()
{
    writeln("compile_time=", compileValue, " runtime=", square(12));
}
