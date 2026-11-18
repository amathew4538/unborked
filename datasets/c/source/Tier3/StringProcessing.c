#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void) {
    char text[512];
    printf("Enter text: ");
    fflush(stdout);
    if (!fgets(text, sizeof(text), stdin)) text[0] = '\0';

    int letters = 0, digits = 0, words = 0, in_word = 0;
    for (char *p = text; *p; ++p) {
        unsigned char c = (unsigned char)*p;
        letters += isalpha(c) != 0;
        digits += isdigit(c) != 0;
        if (isalnum(c)) {
            if (!in_word) ++words;
            in_word = 1;
        } else {
            in_word = 0;
        }
    }
    printf("letters=%d digits=%d words=%d\n", letters, digits, words);
    return 0;
}
