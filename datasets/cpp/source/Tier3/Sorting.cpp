#include <cstdio>

int main(void) {
    int values[] = {42, 7, 13, 2, 64, 1};
    int length = 6;

    for (int i = 1; i < length; i++) {
        int value = values[i];
        int j = i - 1;
        while (j >= 0 && values[j] > value) {
            values[j + 1] = values[j];
            j--;
        }
        values[j + 1] = value;
    }

    for (int i = 0; i < length; i++) {
        printf("%d%s", values[i], i + 1 == length ? "\n" : " ");
    }
    return 0;
}
