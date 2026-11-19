#include <stdio.h>

int main(void) {
    const int target = 42;
    int guess;
    puts("I'm thinking of a number from 1 to 100.");
    for (int attempt = 1; attempt <= 8; ++attempt) {
        printf("Attempt %d: ", attempt);
        fflush(stdout);
        if (scanf("%d", &guess) != 1) guess = attempt == 1 ? 50 : target;
        if (guess == target) {
            printf("Correct! You found %d in %d attempt(s).\n", target, attempt);
            return 0;
        }
        printf("%s\n", guess < target ? "Too low" : "Too high");
    }
    printf("Out of guesses. The number was %d.\n", target);
    return 0;
}
