#include <stdio.h>

int modulo(int a, int b) {
    return a % b;
}

int main() {
    printf("%d\n", modulo(0, 1));
    printf("%d\n", modulo(7, 13));
    printf("%d\n", modulo(65536, 1000));
    printf("%d\n", modulo(64, 8));
    printf("%d\n", modulo(-42, -1));
}
