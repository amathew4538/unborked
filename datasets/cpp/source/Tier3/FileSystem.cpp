#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    char path[256];
    char line[256];

    printf("Config file path (or press Enter for unborked.conf): ");
    fflush(stdout);
    if (fgets(path, sizeof(path), stdin) == NULL) path[0] = '\0';
    if (path[0] == '\n' || path[0] == '\0') {
        strncpy(path, "unborked.conf", sizeof(path));
        path[sizeof(path) - 1] = '\0';
    } else {
        size_t length = strlen(path);
        if (length > 0 && path[length - 1] == '\n') path[length - 1] = '\0';
    }

    FILE *file = fopen(path, "w");
    if (!file) {
        fprintf(stderr, "Could not open %s\n", path);
        return 1;
    }
    fputs("log_level=info\ntheme=dark\n", file);
    fclose(file);

    file = fopen(path, "r");
    if (!file) {
        fprintf(stderr, "Could not read %s\n", path);
        return 1;
    }
    printf("Contents of %s:\n", path);
    while (fgets(line, sizeof(line), file)) fputs(line, stdout);
    fclose(file);
    remove(path);
    return 0;
}
