#include <cstdio>
#include <ctype.h>
#include <string.h>

int main(void) {
    const char input[] = "Hello World!";
    size_t length = strlen(input);

    printf("upper: ");
    for (size_t i = 0; i < length; i++) {
        printf("%c", toupper((unsigned char)input[i]));
    }

    printf("\nreverse: ");
    for (size_t i = length; i > 0; i--) {
        printf("%c", input[i - 1]);
    }
    printf("\nwords: 2\n");
    return 0;
}
