#include <stdio.h>

const char* classify(int n) {
    if (n < 0) return "negative";
    if (n > 0) return "positive";
    return "zero";
}

int main() {
    printf("%s\n%s\n%s\n", classify(-1), classify(0), classify(1));
}
