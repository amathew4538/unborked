#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(int argc, char **argv) {
  FILE *f = argc > 1 ? fopen(argv[1], "rb") : NULL;
  if (!f) {
    puts("usage: FileRead <file>");
    return 1;
  }
  char b[128];
  size_t n = fread(b, 1, sizeof(b), f);
  printf("read=%zu bytes\n", n);
  fclose(f);
}
