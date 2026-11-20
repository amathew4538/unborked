#include <cstdio>

int integer_var = 13;
float float_var = 3.14f;
double double_var = 0.456;
const char* string_var = "Hello, World!";
static bool boolean_var = true;

int main() {
    printf("Integer: %d, Float: %f, Double: %lf, String: %s, Boolean: %d", integer_var, float_var, double_var, string_var, boolean_var);
}
