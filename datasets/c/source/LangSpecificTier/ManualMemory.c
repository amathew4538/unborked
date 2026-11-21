#include <stdio.h>
#include <stdlib.h>
int main(void) {
  size_t cap = 2;
  int *items = malloc(cap * sizeof *items);
  if (!items)
    return 1;
  items[0] = 7;
  items[1] = 11;
  cap = 4;
  int *grown = realloc(items, cap * sizeof *items);
  if (!grown) {
    free(items);
    return 1;
  }
  items = grown;
  items[2] = 13;
  items[3] = 17;
  for (size_t i = 0; i < cap; i++)
    printf("%d%s", items[i], i + 1 < cap ? " " : "\n");
  free(items);
  return 0;
}
