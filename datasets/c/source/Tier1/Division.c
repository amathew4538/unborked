#include <stdio.h>

int divide(int a, int b) {
    return a / b;
}

int main() {
    printf("%d\n", divide(0, 1));
    printf("%d\n", divide(7, 13));
    printf("%d\n", divide(65536, 1000));
    printf("%d\n", divide(64, 8));
    printf("%d\n", divide(-42, -1));
}