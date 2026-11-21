#include <stdio.h>
#include <string.h>
unsigned hash(const char *s) {
  unsigned h = 5381;
  for (; *s; s++)
    h = ((h << 5) + h) + (unsigned)*s;
  return h;
}
int main(void) {
  printf("admin=%u\n", hash("admin") % 16);
  printf("guest=%u\n", hash("guest") % 16);
}
