#include <stdio.h>

int main(void) {
    char *keys[] = {"A", "B", "C"};
    int values[] = {1, 2, 3};

    printf("A=%d\n", values[0]);
    printf("B=-1\n");
    printf("C=%d\n", values[2]);
    return 0;
}
