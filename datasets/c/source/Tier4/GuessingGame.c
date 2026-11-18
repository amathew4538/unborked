#include <stdio.h>

int main(void) {
    const int target = 5;
    int guesses[] = {7, 3, 5};

    for (int i = 0; i < 3; i++) {
        printf("guess %d: %d\n", i + 1, guesses[i]);
        if (guesses[i] == target) {
            printf("found: %d\n", target);
            return 0;
        }
    }
    return 0;
}
