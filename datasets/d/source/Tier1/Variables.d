import std.stdio;

int integer_var = 13;
float float_var = 3.14f;
double double_var = 0.456;
const string string_var = "Hello, World!";
static bool boolean_var = true;

void main() {
   writefln(
        "Integer: %d, Float: %f, Double: %f, String: %s, Boolean: %s",
        integer_var,
        float_var,
        double_var,
        string_var,
        boolean_var
   );
}