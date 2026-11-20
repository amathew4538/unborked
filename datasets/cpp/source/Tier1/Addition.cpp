#include <cstdio>

int add(int a, int b) {
    return a + b;
}

int main() {
    printf("%d\n", add(0, 1));
    printf("%d\n", add(7, 13));
    printf("%d\n", add(65536, 1000));
    printf("%d\n", add(64, 8));
    printf("%d\n", add(-42, -1));
}
