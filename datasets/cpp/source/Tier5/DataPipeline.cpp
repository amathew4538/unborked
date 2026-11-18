#include <cstdio>

int main(void) {
    int input[] = {1, 2, 3, 4, 5, 6};
    int sum = 0;
    int count = 0;

    for (int i = 0; i < 6; i++) {
        if (input[i] % 2 == 0) {
            sum += input[i] * input[i];
            count++;
        }
    }

    printf("processed: %d\n", count);
    printf("squares sum: %d\n", sum);
    return 0;
}
