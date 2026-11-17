#include <stdio.h>

void void_function() {
    printf("Hello from the void function.");
}

const char* return_function() {
    return "Hello from the return function.";
}

int parameter_function(int a) {
    return a + 1;
}

int main() {
    void_function();
    printf("%s", return_function());
    printf("%d", parameter_function(6));
}