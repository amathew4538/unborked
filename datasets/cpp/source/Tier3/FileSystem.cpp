#include <cstdio>

int main(void) {
    FILE *file = fopen("unborked_tier3.txt", "w");
    if (file == NULL) {
        return 1;
    }

    fputs("Hello, Dataset!", file);
    fclose(file);

    file = fopen("unborked_tier3.txt", "r");
    if (file == NULL) {
        return 1;
    }

    char content[64] = {0};
    fgets(content, sizeof(content), file);
    fclose(file);

    printf("filesystem: %s\n", content);
    remove("unborked_tier3.txt");
    return 0;
}
