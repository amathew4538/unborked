#include <stdio.h>

int binary_search(const int *values, int length, int target) {
    int low = 0;
    int high = length - 1;

    while (low <= high) {
        int middle = low + (high - low) / 2;
        if (values[middle] == target) {
            return middle;
        }
        if (values[middle] < target) {
            low = middle + 1;
        } else {
            high = middle - 1;
        }
    }
    return -1;
}

int main(void) {
    int values[] = {2, 7, 13, 42, 64, 100};
    printf("index: %d\n", binary_search(values, 6, 42));
    return 0;
}
