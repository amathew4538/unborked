#include <iostream>
#include <cstdlib>
#include <dlfcn.h>

int main(int argc, char **argv) {
    void *handle = dlopen(NULL, RTLD_NOW);
    long (*parse)(const char *, char **, int) = handle ? (long (*)(const char *, char **, int))dlsym(handle, "strtol") : NULL;
    const char *text = argc > 1 ? argv[1] : "8080";
    char *end = nullptr;
    long port = parse ? parse(text, &end, 10) : std::strtol(text, &end, 10);
    std::cout << "CInterop dlopen=strtol port=" << port << " valid=" << (end && *end == '\0' ? "true" : "false") << "\n";
    if (handle) dlclose(handle);
    return 0;
}
