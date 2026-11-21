#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <unistd.h>

int main(int argc, char **argv) {
    void *handle = dlopen(NULL, RTLD_NOW);
    long (*parse)(const char *, char **, int) = handle ? dlsym(handle, "strtol") : NULL;
    const char *text = argc > 1 ? argv[1] : "8080";
    char *end = NULL;
    long port = parse ? parse(text, &end, 10) : strtol(text, &end, 10);
    printf("CInterop dlopen=strtol port=%ld valid=%s\n", port, end && *end == '\0' ? "true" : "false");
    if (handle) dlclose(handle);
    return 0;
}
