import std.stdio;

void void_function()
{
    writeln("Hello from the void function.");
}

string return_function()
{
    return "Hello from the return function.";
}

int parameter_function(int a)
{
    return a + 1;
}

void main()
{
    void_function();
    writeln(return_function());
    writeln(parameter_function(6));
}
