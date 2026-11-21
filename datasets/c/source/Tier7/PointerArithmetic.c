#include <stdio.h>
int main(void) {
  int a[] = {10, 20, 30, 40};
  int *p = a;
  for (int i = 0; i < 4; i++, p++)
    printf("%d@%td\n", *p, p - a);
  printf("total=%d\n", a[0] + a[3]);
}
