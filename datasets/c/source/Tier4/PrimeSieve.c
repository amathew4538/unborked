#include <stdio.h>
#include <string.h>

int main(void) {
    int limit = 30;
    unsigned char prime[31];
    memset(prime, 1, sizeof(prime));
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
    return 0;
}
