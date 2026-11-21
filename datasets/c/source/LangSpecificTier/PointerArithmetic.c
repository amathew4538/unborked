#include <stdio.h>
int main(void) {
  int page[] = {10, 20, 30, 40};
  int *cursor = page;
  for (int i = 0; i < 4; i++, cursor++)
    printf("item[%d]=%d offset=%td\n", i, *cursor, cursor - page);
  return 0;
}
