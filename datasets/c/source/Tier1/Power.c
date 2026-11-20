#include <stdio.h>

int power(int a, int b) {
    int result = 1;
    for (int i = 0; i < b; i++) {
        result *= a;
    }
    return result;
}

int main() {
    printf("%d\n", power(2, 8));
    printf("%d\n", power(3, 4));
}
