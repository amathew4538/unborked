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
    int target;
    printf("Lookup in sorted inventory [2 7 13 42 64 100]: ");
    if (scanf("%d", &target) != 1) target = 42;
    int index = binary_search(values, 6, target);
    printf(index >= 0 ? "found: %d at slot %d\n" : "not found: %d\n", target, index);
    return 0;
}
