#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void) {
    char keys[3] = {'A', 'B', 'C'};
    int values[3] = {1, 2, 3};
    int size = 3;

    char key;
    puts("LRU cache demo: A=1 B=2 C=3");
    puts("Enter key (GET), lowercase key (PUT), or q:");
    while (scanf(" %c", &key) == 1 && key != 'q') {
        int index = -1;
        for (int i = 0; i < size; ++i)
            if ((char)toupper((unsigned char)keys[i]) == (char)toupper((unsigned char)key)) index = i;
        if (index >= 0) {
            printf("%c=%d\n", keys[index], values[index]);
        } else if (key >= 'a' && key <= 'z') {
            char new_key = (char)toupper((unsigned char)key);
            memmove(keys + 1, keys, (size_t)(size - 1));
            memmove(values + 1, values, sizeof(int) * (size_t)(size - 1));
            keys[0] = new_key;
            values[0] = 9;
            printf("PUT %c=9\n", new_key);
        } else {
            printf("MISS %c\n", key);
        }
    }
    return 0;
}
