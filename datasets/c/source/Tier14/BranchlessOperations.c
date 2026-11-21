#include <stdio.h>
int main(void) {
  int a = -12, b = 25;
  int max = a + (b - a) * (a < b);
  int abs = a < 0 ? -a : a;
  printf("max=%d abs_a=%d\n", max, abs);
}
