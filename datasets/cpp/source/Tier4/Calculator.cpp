#include <stdio.h>

int main(void) {
    double first = 0, second = 0;
    char op = '+';
    printf("Calculator: enter 'left op right' (example: 12.5 * 4): ");
    fflush(stdout);
    if (scanf("%lf %c %lf", &first, &op, &second) != 3) {
        first = 8;
        op = '+';
        second = 2;
    }
    if (op == '/' && second == 0) {
        puts("error: division by zero");
        return 1;
    }
    double result;
    switch (op) {
        case '+': result = first + second; break;
        case '-': result = first - second; break;
        case '*': result = first * second; break;
        case '/': result = first / second; break;
        default: puts("error: unsupported operator"); return 1;
    }
    printf("%.2f %c %.2f = %.2f\n", first, op, second, result);
    return 0;
}
