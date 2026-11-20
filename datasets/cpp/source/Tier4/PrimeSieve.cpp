#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void) {
    int limit;
    printf("Find primes through: ");
    fflush(stdout);
    if (scanf("%d", &limit) != 1 || limit < 2) limit = 30;
    unsigned char *prime = static_cast<unsigned char *>(malloc((size_t)limit + 1));
    if (!prime) return 1;
    memset(prime, 1, (size_t)limit + 1);
    prime[0] = prime[1] = 0;

    for (int i = 2; i * i <= limit; i++) {
        if (prime[i]) {
            for (int j = i * i; j <= limit; j += i) {
                prime[j] = 0;
            }
        }
    }

    printf("primes:");
    for (int i = 2; i <= limit; i++) {
        if (prime[i]) {
            printf(" %d", i);
        }
    }
    printf("\n");
    free(prime);
    return 0;
}
